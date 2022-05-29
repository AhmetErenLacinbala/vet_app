package com.example.internship_task.repository;


import com.example.internship_task.model.PetDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetDateRepository extends JpaRepository<PetDate, String> {

}
