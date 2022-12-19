package com.example.footballapi.controller.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
public class MatchResponse {
    private long id;
    private LocalDateTime datetime;

    private TeamResponse firstTeam;
    private TeamResponse secondTeam;
}
