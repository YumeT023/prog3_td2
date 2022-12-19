package com.example.footballapi.service;

import com.example.footballapi.model.MatchEntity;
import com.example.footballapi.repository.MatchRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MatchService {
    private final MatchRepository repository;

    public List<MatchEntity> getAll() {
       return repository.findAll();
    }
}
