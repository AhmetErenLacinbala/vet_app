package com.example.internship_task.controller;

import com.example.internship_task.model.Customer;
import com.example.internship_task.model.Pet;
import com.example.internship_task.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/pets")
public class PetController {

    @Autowired
    PetRepository petRepository;

    @GetMapping
    List<Pet> getCustomers(){return petRepository.findAll();}

    @PostMapping
    Pet createPet(@RequestBody Pet pet) {return petRepository.save(pet);}

}
