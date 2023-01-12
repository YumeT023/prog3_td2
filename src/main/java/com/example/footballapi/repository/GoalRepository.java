package com.example.footballapi.repository;

import com.example.footballapi.model.GoalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoalRepository extends JpaRepository<GoalEntity, String> {
    GoalEntity findByMatchId(long matchId);
}
