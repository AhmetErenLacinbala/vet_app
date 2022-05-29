package com.example.internship_task.dto;


import lombok.Data;

import java.util.Date;

@Data
public class PetDateDto {
    private String id;
    private Date visit_date;

    public PetDateDto(String id, Date visit_date) {
        this.id = id;
        this.visit_date = visit_date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getVisit_date() {
        return visit_date;
    }

    public void setVisit_date(Date visit_date) {
        this.visit_date = visit_date;
    }
}
