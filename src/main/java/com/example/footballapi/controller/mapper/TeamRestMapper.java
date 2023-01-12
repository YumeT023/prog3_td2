package com.example.footballapi.controller.mapper;

import com.example.footballapi.controller.model.TeamResponse;
import com.example.footballapi.model.TeamEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TeamRestMapper {
    private final PlayerRestMapper playerRestMapper;
    private final SponsorRestMapper sponsorRestMapper;

    public TeamResponse toRest(TeamEntity domain) {
        var playerEntities = domain.getPlayers().stream().map(playerRestMapper::toRest).toList();
        var sponsorEntities = domain.getSponsors().stream().map(sponsorRestMapper::toRest).toList();

        return TeamResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .sponsors(sponsorEntities)
                .players(playerEntities)
                .build();
    }
}
