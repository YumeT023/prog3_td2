package com.example.footballapi.repository;

import com.example.footballapi.model.PlayerEntity;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerRepository extends JpaRepository<PlayerEntity, String> {
    List<PlayerEntity> findAllByTeamId(long team_id, Sort sort);
}
