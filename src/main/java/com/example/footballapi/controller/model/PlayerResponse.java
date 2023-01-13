package com.example.footballapi.controller.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class PlayerResponse {
    private long id;
    private String name;
    private boolean isGoalKeeper;
}
