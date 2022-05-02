package com.example.internship_task.costumer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JANUARY;

@Configuration
public class CostumerConfig {
    @Bean
    CommandLineRunner commandLineRunner(CostumerRepository repository){
        return args -> {
            Costumer ali = new Costumer(
                    "ali",
                    "bise@bise.com",
                    LocalDate.of(2000, JANUARY,5),
                    132154

            );
            Costumer ahmet = new Costumer(
                    "ahmet",
                    "bise2@bise.com",
                    LocalDate.of(1999, JANUARY,15),
                    132354

            );

            repository.saveAll(
                    List.of(ali, ahmet)
            );


        };
    }
}
