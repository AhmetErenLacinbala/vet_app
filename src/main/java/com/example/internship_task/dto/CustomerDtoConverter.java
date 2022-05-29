package com.example.internship_task.dto;

import com.example.internship_task.model.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerDtoConverter {//id, name, tel, email, reg_date
    public PetCustomerDto convertToPetCustomer(Customer from) {
        if (from == null) {
            return new PetCustomerDto("","",null,"",null, null);
        }
        return new PetCustomerDto(
                from.getId(),
                from.getName(),
                from.getTel(),
                from.getEmail(),
                from.getReg_date(),
                from.getPets()
        );
    }
}
