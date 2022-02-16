package com.example.t3be.service.impl;

import com.example.t3be.dob.Customer;
import com.example.t3be.repository.CustomerRepository;
import com.example.t3be.service.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerServices {
    private final CustomerRepository repository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public Customer save(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public List<Customer> findAll() {
        return (List<Customer>) repository.findAll();
    }
}

