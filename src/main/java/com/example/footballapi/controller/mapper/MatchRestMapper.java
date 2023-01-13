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
    private final PlayedTeamRestMapper playedTeamRestMapper;
    private final GoalService goalService;

    public MatchResponse toRest(MatchEntity domain) {
        var goal = goalService.getByMatchId(domain.getId());

        return MatchResponse.builder()
                .id(domain.getId())
                .datetime(domain.getDatetime())
                .teamHome(playedTeamRestMapper.toRest(domain.getTeamA(), goal.getId()))
                .teamAway(playedTeamRestMapper.toRest(domain.getTeamB(), goal.getId()))
                .build();
    }
}
