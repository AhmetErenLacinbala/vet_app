package com.example.internship_task.dto;

import com.example.internship_task.model.PetDate;
import org.springframework.stereotype.Component;

@Component
public class PetDateDtoConverter {
    public PetDateDto convert(PetDate from) {
        return new PetDateDto(
                from.getId(),
                from.getVisit_date()
        );
    }
}
