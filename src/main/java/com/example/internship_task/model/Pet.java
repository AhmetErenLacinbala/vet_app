package com.example.internship_task.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Pet {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name="UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    private String name;
    private String species;
    private String breed;
    private int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
/*@ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL]) //
    @JoinColumn(name = "customer_id", nullable = false)
    Customer customer;*/

   /* @OneToMany(mappedBy = "pet", fetch = FetchType.LAZY) //BURASI EAGER OLABİLİR DİKKAT
    private List <Pet_date> pet_date;*/





}
