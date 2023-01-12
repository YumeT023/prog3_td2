package com.example.footballapi.controller.mapper;

import com.example.footballapi.controller.model.MatchResponse;
import com.example.footballapi.controller.model.ScoreResponse;
import com.example.footballapi.model.MatchEntity;
import com.example.footballapi.service.GoalService;
import com.example.footballapi.service.ScoreService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
@AllArgsConstructor
public class MatchRestMapper {
    private final TeamRestMapper teamRestMapper;
    private final ScoreService scoreService;
    private final GoalService goalService;
    private final ScoreRestMapper scoreRestMapper;

    public MatchResponse toRest(MatchEntity domain) {
        var teamA = teamRestMapper.toRest(domain.getTeamA());
        var teamB = teamRestMapper.toRest(domain.getTeamB());

        var goalEntity = goalService.getByMatchId(domain.getId());
        var goalScorers = scoreService.getGoalScorers(goalEntity.getId());

        List<ScoreResponse> goalScorerTeamA = new ArrayList<>();
        List<ScoreResponse> goalScorerTeamB = new ArrayList<>();

        goalScorers.forEach(goalScorer -> {
            var teamId = goalScorer.getPlayer().getTeam().getId();
            var scoreResponse = scoreRestMapper.toRest(goalScorer);
            if (teamId == teamA.getId()) {
                goalScorerTeamA.add(scoreResponse);
            } else {
                goalScorerTeamB.add(scoreResponse);
            }
        });

        var score = new HashMap<String, Number>();
        score.put("teamA", goalScorerTeamA.size());
        score.put("teamB", goalScorerTeamB.size());

        return MatchResponse.builder()
                .id(domain.getId())
                .datetime(domain.getDatetime())
                .score(score)
                .teamA(teamA)
                .teamB(teamB)
                .goalScorersA(goalScorerTeamA)
                .goalScorersB(goalScorerTeamB)
                .build();
    }
}
