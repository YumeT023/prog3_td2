package com.example.footballapi.service;

import com.example.footballapi.model.PlayerEntity;
import com.example.footballapi.repository.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlayerService {
    private final PlayerRepository repository;

    public List<PlayerEntity> getPlayerByTeamId(long teamId) {
        return repository.findAllByTeamId(teamId);
    }
}
