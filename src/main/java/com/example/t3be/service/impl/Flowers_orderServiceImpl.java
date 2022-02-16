package com.example.t3be.service.impl;

import com.example.t3be.dob.Flowers_order;
import com.example.t3be.repository.Flowers_orderRepository;
import com.example.t3be.service.Flower_orderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class Flowers_orderServiceImpl implements Flower_orderServices {
    private final Flowers_orderRepository repository;

    @Autowired
    public Flowers_orderServiceImpl(Flowers_orderRepository repository) {
        this.repository = repository;
    }

    @Override
    public Flowers_order save(Flowers_order flowers_order) {
        return repository.save(flowers_order);
    }

    @Override
    public List<Flowers_order> findAll() {
        return (List<Flowers_order>) repository.findAll();
    }
}

