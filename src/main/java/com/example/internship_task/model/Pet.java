package com.example.internship_task.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;


@Entity
public class Pet {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name="UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    private String name;
    private String species;
    private String breed;
    private Integer age;


    @Column(columnDefinition = "TEXT")
    private String description;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @OneToMany(mappedBy = "pet", fetch = FetchType.LAZY ) //BURASI EAGER OLABİLİR DİKKAT
    private Set<PetDate> petDates;

    public Pet(String id,
               String name,
               String species,
               String breed,
               Integer age,
               String description,
               Customer customer,
               Set<PetDate> petDates) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.age = age;
        this.description = description;
        this.customer = customer;
        this.petDates = petDates;
    }

    public Pet() {
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Set<PetDate> getPetDates() {
        return petDates;
    }

    public void setPetDates(Set<PetDate> petDates) {
        this.petDates = petDates;
    }





   /*@ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL]) //
    @JoinColumn(name = "customer_id", nullable = false)
    Customer customer;*/

   /* @OneToMany(mappedBy = "pet", fetch = FetchType.LAZY) //BURASI EAGER OLABİLİR DİKKAT
    private List <Pet_date> pet_date;*/





}
