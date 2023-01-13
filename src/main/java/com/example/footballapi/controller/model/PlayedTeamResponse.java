package com.example.footballapi.controller.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
public class PlayedTeamResponse {
    private long id;
    private String name;

    private List<PlayerResponse> players;
    private List<SponsorResponse> sponsors;

    private int goals;
    private List<ScoreResponse> scorers;
}
