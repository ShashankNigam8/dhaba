package com.aapkaapnadhaba.com.demo.service;

import Model.Customer;
import com.aapkaapnadhaba.com.demo.Repository.FoodAppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodAppServiceImpl {

    private FoodAppRepository foodAppRepository;

    @Autowired
    public FoodAppServiceImpl(FoodAppRepository theFoodAppRepository){
        foodAppRepository = theFoodAppRepository;
    }


    public Customer save(Customer customer){
        return foodAppRepository.save(customer);
    }
}
