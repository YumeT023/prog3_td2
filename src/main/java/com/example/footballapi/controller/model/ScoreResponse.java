package com.example.footballapi.controller.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class ScoreResponse {
    private long id;
    private ScorePlayerResponse player;
    private int scoringTime;
    private boolean isOG;
}
