package com.example.internship_task.costumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CostumerService {
    private final CostumerRepository costumerRepository;

    @Autowired
    public CostumerService(CostumerRepository costumerRepository){
        this.costumerRepository = costumerRepository;
    }

    public List<Costumer> getCostumers(){
        return costumerRepository.findAll();
    }

    public void addNewCostumer(Costumer costumer) {
        System.out.println(costumer);
    }
}
