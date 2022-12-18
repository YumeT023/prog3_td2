package com.example.footballapi.controller.mapper;

import com.example.footballapi.controller.model.PlayerResponse;
import com.example.footballapi.model.PlayerEntity;
import org.springframework.stereotype.Component;

@Component
public class PlayerRestMapper {
    public PlayerResponse toRest(PlayerEntity domain) {
        return PlayerResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .build();
    }
}
