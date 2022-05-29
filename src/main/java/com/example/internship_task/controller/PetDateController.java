package com.example.internship_task.controller;


import com.example.internship_task.model.PetDate;
import com.example.internship_task.repository.PetDateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/petdates")
public class PetDateController {

    @Autowired
    PetDateRepository petDateRepository;

    @GetMapping
    List<PetDate> getPetDates(){return petDateRepository.findAll();}

    @PostMapping
    PetDate createPetDate(@RequestBody PetDate petDate) {return petDateRepository.save(petDate);}

}
