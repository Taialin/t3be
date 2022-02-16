package com.example.t3be.controller;

import com.example.t3be.dob.Order;
import com.example.t3be.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public List<Order> getOrders() {
        return orderService.findAll();
    }

}

