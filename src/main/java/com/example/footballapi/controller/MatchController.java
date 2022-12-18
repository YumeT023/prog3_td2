package com.example.footballapi.controller;

import com.example.footballapi.controller.mapper.MatchRestMapper;
import com.example.footballapi.controller.model.MatchResponse;
import com.example.footballapi.service.MatchService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("matches")
public class MatchController {
    private final MatchService service;
    private final MatchRestMapper mapper;

    @GetMapping
    public List<MatchResponse> getAll() {
        return service.getAll().stream().map(mapper::toRest).toList();
    }
}
