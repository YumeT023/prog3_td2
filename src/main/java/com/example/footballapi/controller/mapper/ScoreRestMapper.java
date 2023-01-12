package com.example.footballapi.controller.mapper;

import com.example.footballapi.controller.model.ScoreResponse;
import com.example.footballapi.model.ScoreEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ScoreRestMapper {
    private final PlayerRestMapper playerRestMapper;

    public ScoreResponse toRest(ScoreEntity domain) {
        return ScoreResponse.builder()
                .id(domain.getId())
                .scoringTime(domain.getScoringTime())
                .isOG(domain.isOG())
                .player(playerRestMapper.toScoreRest(domain.getPlayer()))
                .build();
    }
}

