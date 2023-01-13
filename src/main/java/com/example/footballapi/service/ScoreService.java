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

    public List<ScoreEntity> getGoalScorersByTeamId(long goalId, long teamId) {
        return this.getGoalScorersByGoalId(goalId).stream().filter(
                scorer -> {
                    var $teamId = scorer.getPlayer().getTeam().getId();

                    if ($teamId == teamId) {
                        return !scorer.isOG();
                    }
                    return scorer.isOG();
                }
        ).toList();
    }

    public List<ScoreEntity> getGoalScorersByGoalId(long goalId) {
        return repository.findAllByGoalId(goalId);
    }
}
