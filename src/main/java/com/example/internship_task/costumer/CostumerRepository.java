package com.example.internship_task.costumer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CostumerRepository extends JpaRepository <Costumer, Long> {

    //@Query("SELECT s FROM Costumer s Where s.email = ?1);
    Optional<Costumer> findCostumerByEmail(String email);
}
