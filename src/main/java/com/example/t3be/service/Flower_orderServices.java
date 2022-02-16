package com.example.t3be.service;

import com.example.t3be.dob.Flowers_order;

import java.util.List;

public interface Flower_orderServices {
    Flowers_order save(Flowers_order flowers_order);

    List<Flowers_order> findAll();
}
