package com.example.t3be.service.impl;

import com.example.t3be.dob.Order;
import com.example.t3be.repository.OrderRepository;
import com.example.t3be.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    private final OrderRepository repository;

    @Autowired
    public OrderServiceImpl(OrderRepository repository) {
        this.repository = repository;
    }

    @Override
    public Order save(Order order) {
        return repository.save(order);
    }

    @Override
    public List<Order> findAll() {
        return (List<Order>) repository.findAll();
    }
}
