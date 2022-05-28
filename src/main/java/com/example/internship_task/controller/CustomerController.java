package com.example.internship_task.controller;

import com.example.internship_task.model.Customer;
import com.example.internship_task.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping
    List<Customer> getCustomers(){return customerRepository.findAll();}

    @PostMapping
    Customer createCustomer(@RequestBody Customer customer) {return customerRepository.save(customer);}

}
