package com.example.footballapi.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "player_score_goal")
public class ScoreEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;

    @Column(nullable = false)
    private int scoringTime;

    @Column(nullable = false)
    private boolean isOG;

    @ManyToOne
    @JoinColumn(name = "goal_id")
    private GoalEntity goal;

    @ManyToOne
    @JoinColumn(name = "player_id")
    private PlayerEntity player;

}
