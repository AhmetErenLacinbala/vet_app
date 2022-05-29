package com.example.internship_task.dto;
import com.example.internship_task.model.Pet;
import lombok.Data;


import java.time.LocalDate;
import java.util.Set;

@Data
public class PetCustomerDto{
    private String id;
    private String name;
    private Integer tel;
    private String email;
    private LocalDate reg_date;

    private Set<Pet> pets;



    public PetCustomerDto(String id, String name, Integer tel, String email, LocalDate reg_date, Set<Pet> pets) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.email = email;
        this.reg_date = reg_date;
        this.pets =  pets;
    }

    public PetCustomerDto() {
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

    public int getTel() {
        return tel;
    }

    public void setTel(Integer tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getReg_date() {
        return reg_date;
    }

    public void setReg_date(LocalDate reg_date) {
        this.reg_date = reg_date;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
