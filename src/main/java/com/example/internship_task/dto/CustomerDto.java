package com.example.internship_task.dto;

import lombok.Data;
import java.time.LocalDate;
import java.util.Set;

@Data
public class CustomerDto {
    private String id;
    private String name;
    private Integer tel;
    private String email;
    private LocalDate reg_date;
    private Set<CustomerPetDto> accounts;

    public CustomerDto(String id, String name, Integer tel, String email, LocalDate reg_date, Set<CustomerPetDto> accounts) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.email = email;
        this.reg_date = reg_date;
        this.accounts = accounts;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getTel() {
        return tel;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getReg_date() {
        return reg_date;
    }

    public Set<CustomerPetDto> getAccounts() {
        return accounts;
    }
}
