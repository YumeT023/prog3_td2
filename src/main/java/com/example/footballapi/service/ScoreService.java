package com.example.footballapi.service;

import com.example.footballapi.model.ScoreEntity;
import com.example.footballapi.repository.ScoreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ScoreService {
    private final ScoreRepository repository;

    public List<ScoreEntity> getGoalScorers(long goalId) {
        return repository.findAllByGoalId(goalId);
    }
}
