package com.example.t3be.controller;

import com.example.t3be.dob.Customer;
import com.example.t3be.service.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerServices customerServices;

    @PostMapping("/registrate")
    @CrossOrigin(origins = "*")
    public Customer registrate(@RequestBody Customer customer) {
        return customerServices.save(customer);
    }
}
