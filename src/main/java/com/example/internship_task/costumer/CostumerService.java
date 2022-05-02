package com.example.internship_task.costumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Objects;
import java.util.Optional;

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
        Optional <Costumer> costumerOptional = costumerRepository
                .findCostumerByEmail(costumer.getEmail());

        if(costumerOptional.isPresent()){
            throw new IllegalStateException("email taken");
        }
        costumerRepository.save(costumer);

        System.out.println(costumer);
    }

    public void deleteCostumer(Long costumerId){
        boolean exists = costumerRepository.existsById(costumerId);
        if(!exists){
            throw new IllegalStateException("costumer with id" + costumerId + "does not exists");
        }
        costumerRepository.deleteById(costumerId);
    }

    @Transactional
    public void updateCostumer(Long costumerId,
                               String name,
                               String email,
                               Long tel_no){
        Costumer costumer = costumerRepository.findById(costumerId).orElseThrow(()-> new IllegalStateException(
                "costumer with id" + costumerId + "does not exists"
        ));
        if(name!=null &&
            name.length()>0 &&
            !Objects.equals(costumer.getName(), name)){
            costumer.setName(name);
        }

        if(email!=null &&
                email.length()>0 &&
                !Objects.equals(costumer.getEmail(), email)){
            Optional <Costumer> costumerOptional = costumerRepository.findCostumerByEmail(email);
            if(costumerOptional.isPresent()){
                throw new IllegalStateException("email taken");
            }
            costumer.setEmail(email);
        }

        //TODO Add update tel_no
    }

}
