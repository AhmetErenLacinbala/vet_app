package com.example.internship_task.dto;

import com.example.internship_task.model.Customer;
import com.example.internship_task.model.Pet;
import com.example.internship_task.model.PetDate;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class PetDtoConverter {

    private final CustomerDtoConverter customerDtoConverter;
    private  final PetDateDtoConverter petDateDtoConverter;

    public PetDtoConverter(CustomerDtoConverter customerDtoConverter, PetDateDtoConverter petDateDtoConverter) {
        this.customerDtoConverter = customerDtoConverter;
        this.petDateDtoConverter = petDateDtoConverter;
    }

    public PetDto convert(Pet from){
        return new PetDto(
                from.getId(),
                from.getName(),
                from.getSpecies(),
                from.getBreed(),
                from.getAge(),
                from.getDescription(),
                from.getCustomer(), //TODO BURAYA BAK
                from.getPetDates());
    }
}
