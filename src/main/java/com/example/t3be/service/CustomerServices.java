package com.example.t3be.service;

import com.example.t3be.dob.Customer;

import java.util.List;

public interface CustomerServices {
    Customer save(Customer customer);

    List<Customer> findAll();
}


