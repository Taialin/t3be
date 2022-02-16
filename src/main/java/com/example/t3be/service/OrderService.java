package com.example.t3be.service;

import com.example.t3be.dob.Order;

import java.util.List;

public interface OrderService {
    Order save(Order order);

    List<Order> findAll();


}
