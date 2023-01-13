package com.example.footballapi.service;

import com.example.footballapi.model.GoalEntity;
import com.example.footballapi.repository.GoalRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GoalService {
    private final GoalRepository repository;

    public GoalEntity getByMatchId(long matchId){
        return repository.findByMatchId(matchId);
    }
}
