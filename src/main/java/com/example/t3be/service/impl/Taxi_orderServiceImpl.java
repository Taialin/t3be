package com.example.t3be.service.impl;

import com.example.t3be.dob.Taxi_order;
import com.example.t3be.repository.Taxi_orderRepositary;
import com.example.t3be.service.Taxi_orderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class Taxi_orderServiceImpl implements Taxi_orderServices {
    private final Taxi_orderRepositary repository;

    @Autowired
    public Taxi_orderServiceImpl(Taxi_orderRepositary repository) {
        this.repository = repository;
    }

    @Override
    public Taxi_order save(Taxi_order taxi_order) {
        return repository.save(taxi_order);
    }

    @Override
    public List<Taxi_order> findAll() {
        return (List<Taxi_order>) repository.findAll();
    }
}

