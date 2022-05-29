package com.example.internship_task.dto;

import com.example.internship_task.model.PetDate;
import lombok.Data;

import java.util.Set;

@Data
public class CustomerPetDto {
    private String id; //TODO BURADA EKSİK OLABİLİR DİKKAT
    private PetCustomerDto customer;
    private Set<PetDate> petDate;

    public CustomerPetDto(String id, PetCustomerDto customer, Set<PetDate> petDate) {
        this.id = id;
        this.customer = customer;
        this.petDate = petDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
