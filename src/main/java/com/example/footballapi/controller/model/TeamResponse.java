package com.example.footballapi.controller.model;

import com.example.footballapi.model.SponsorEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
public class TeamResponse {
    private long id;
    private String name;

    private List<PlayerResponse> players;
    private List<SponsorEntity> sponsors;
}
