package com.example.footballapi.controller.mapper;

import com.example.footballapi.controller.model.PlayedTeamResponse;
import com.example.footballapi.model.TeamEntity;
import com.example.footballapi.service.ScoreService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PlayedTeamRestMapper {

    private final PlayerRestMapper playerRestMapper;
    private final SponsorRestMapper sponsorRestMapper;
    private final ScoreRestMapper scoreRestMapper;
    private final ScoreService scoreService;

    public PlayedTeamResponse toRest(TeamEntity domain, long goalId) {
        var players = domain.getPlayers().stream().map(playerRestMapper::toRest).toList();
        var sponsors = domain.getSponsors().stream().map(sponsorRestMapper::toRest).toList();

        var scorers = scoreService.getGoalScorers(goalId)
                .stream().filter(scorer -> scorer.getPlayer().getTeam().getId() == domain.getId()).toList();

        return PlayedTeamResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .sponsors(sponsors)
                .players(players)
                .scorers(scorers.stream().map(scoreRestMapper::toRest).toList())
                .goals(scorers.size())
                .build();

    }
}
