package com.example.internship_task.dto;

import com.example.internship_task.model.Customer;
import com.example.internship_task.model.PetDate;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Data
public class PetDto {
    private String id;
    private String name;
    private String species;
    private String breed;
    private Integer age;
    private String description;
    private PetCustomerDto customer;
    private Set<PetDate> petDate;

    public PetDto(String id,
                  String name,
                  String species,
                  String breed,
                  Integer age,
                  String description,
                  PetCustomerDto customer,
                  Set<PetDate> petDate) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.age = age;
        this.description = description;
        this.customer = customer;
        this.petDate = petDate;
    }

    public PetDto() {
    }

    public PetDto(String id,
                  String name,
                  String species,
                  String breed,
                  Integer age,
                  String description,
                  Customer customer,
                  Set<PetDate> petDate) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.age = age;
        this.description = description;
        this.customer = customer;
        this.petDate = petDate;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PetCustomerDto getCustomer() {
        return customer;
    }

    public void setCustomer(PetCustomerDto customer) {
        this.customer = customer;
    }

    public Set<PetDate> getPetDate() {
        return petDate;
    }

    public void setPetDate(Set<PetDate> petDate) {
        this.petDate = petDate;
    }
}
