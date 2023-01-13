package com.example.footballapi.controller.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Builder
@Data
@AllArgsConstructor
public class MatchResponse {
    private long id;
    private LocalDateTime datetime;

    private PlayedTeamResponse teamHome;
    private PlayedTeamResponse teamAway;
}
