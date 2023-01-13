package com.example.footballapi.repository;

import com.example.footballapi.model.ScoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScoreRepository extends JpaRepository<ScoreEntity, String> {
    List<ScoreEntity> findAllByGoalId(long goalId);
}
