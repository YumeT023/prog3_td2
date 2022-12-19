package com.example.footballapi.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "team_play_against")
public class MatchEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;

    @Column(nullable = false)
    private LocalDateTime datetime;

    @Column(nullable = false)
    private String stadium;

    @ManyToOne
    @JoinColumn(name = "team1_id")
    private TeamEntity teamA;

    @ManyToOne
    @JoinColumn(name = "team2_id")
    private TeamEntity teamB;
}
