package com.example.internship_task.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name="UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
//id, name, tel, email, reg_date

    private String name;
    private Integer tel;
    private String email;
    private LocalDate reg_date;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY ) //BURASI EAGER OLABİLİR DİKKAT
    private Set<Pet> pets;

    public Customer(String id,
                    String name,
                    Integer tel,
                    String email,
                    LocalDate reg_date,
                    Set<Pet> pets) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.email = email;
        this.reg_date = reg_date;
        this.pets = pets;
    }
    public Customer() {
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

    public Integer getTel() {
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
        return this.pets;
    }










}
