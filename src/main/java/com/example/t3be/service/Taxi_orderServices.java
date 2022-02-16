package com.example.t3be.service;

import com.example.t3be.dob.Taxi_order;

import java.util.List;

public interface Taxi_orderServices {
    Taxi_order save(Taxi_order taxi_order);

    List<Taxi_order> findAll();
}



