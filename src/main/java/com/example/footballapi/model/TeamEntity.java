package com.example.footballapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "team")
public class TeamEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @ManyToMany
    @JoinTable(
            name = "team_have_sponsor",
            joinColumns = @JoinColumn(name = "team_id"),
            inverseJoinColumns = @JoinColumn(name = "sponsor_id")
    )
    private List<SponsorEntity> sponsors;

    @OneToMany
    @JoinColumn(name = "team_id")
    @OrderBy("number")
    private List<PlayerEntity> players;
}