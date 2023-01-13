package com.example.footballapi.controller.mapper;

import com.example.footballapi.controller.model.SponsorResponse;
import com.example.footballapi.model.SponsorEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class SponsorRestMapper {
    SponsorResponse toRest(SponsorEntity domain) {
        return SponsorResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .build();
    }
}
