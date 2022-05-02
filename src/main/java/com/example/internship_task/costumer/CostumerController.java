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
    @DeleteMapping(path = "{costumerId}")
    public void deleteCostumer(@PathVariable("costumerId") Long costumerId){
        costumerService.deleteCostumer(costumerId);
    }
    @PutMapping(path = "{costumerId}")
    public void updateCostumer(
            @PathVariable("costumerId") Long costumerId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email,
            @RequestParam(required = false) Long tel_no){
        costumerService.updateCostumer(costumerId, name, email, tel_no);
    }


}
