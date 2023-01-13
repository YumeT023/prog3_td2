package com.example.footballapi.controller.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class ScoreResponse {
    private long id;
    private PlayerResponse player;
    private int scoreTime;
    private boolean isOG;
}
