package com.example.footballapi.controller.mapper;

import com.example.footballapi.controller.model.MatchResponse;
import com.example.footballapi.model.MatchEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MatchRestMapper {
    private final TeamRestMapper teamRestMapper;

    public MatchResponse toRest(MatchEntity domain) {
        return MatchResponse.builder()
                .id(domain.getId())
                .datetime(domain.getDatetime())
                .firstTeam(teamRestMapper.toRest(domain.getTeamA()))
                .secondTeam(teamRestMapper.toRest(domain.getTeamB()))
                .build();
    }
}
