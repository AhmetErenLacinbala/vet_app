package com.example.internship_task.costumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(path = "api/v1/costumer") //-> sayfa uzantısı
public class CostumerController {



    private final CostumerService costumerService;

    @Autowired
    public CostumerController(CostumerService costumerService) {
        this.costumerService = costumerService;
    }

    @GetMapping
    public List<Costumer> getCostumers(){
        return costumerService.getCostumers();
    }

    @PostMapping
    public void registerNewCostumer(@RequestBody Costumer costumer){
        costumerService.addNewCostumer(costumer);
    }
}
