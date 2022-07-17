package com.example.t3be.service.impl;

import com.example.t3be.dob.Made_trips;
import com.example.t3be.repository.Made_tripsRepository;
import com.example.t3be.service.Made_tripsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class Made_tripsImpl implements Made_tripsServices {
    private final Made_tripsRepository repository;

    @Autowired
    public Made_tripsImpl(Made_tripsRepository repository) {
        this.repository = repository;
    }

    @Override
    public Made_trips save(Made_trips made_trips) {
        return repository.save(made_trips);
    }

    @Override
    public List<Made_trips> findAll() {
        return (List<Made_trips>) repository.findAll();
    }
}
