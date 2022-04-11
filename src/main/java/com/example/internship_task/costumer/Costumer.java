package com.example.internship_task.costumer;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Costumer {
    @Id
    @SequenceGenerator(
            name="costumer_sequence",
            sequenceName="costumer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "costumer_sequence"
    )

    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer tel_no;

    public Costumer(){

    }
    public Costumer(Long id, String name, String email, LocalDate dob, Integer tel_no) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.tel_no = tel_no;
    }

    public Costumer(String name, String email, LocalDate dob, Integer tel_no) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.tel_no = tel_no;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getTel_no() {
        return tel_no;
    }

    public void setTel_no(Integer tel_no) {
        this.tel_no = tel_no;
    }

    @Override
    public String toString() {
        return "Costumer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", tel_no=" + tel_no +
                '}';
    }
}
