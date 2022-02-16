package com.example.t3be.service.impl;

import com.example.t3be.dob.Add_services;
import com.example.t3be.repository.Add_ServicesRepository;
import com.example.t3be.service.Add_ServicesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class Add_servicesServiceImpl implements Add_ServicesServices {
    private final Add_ServicesRepository repository;

    @Autowired
    public Add_servicesServiceImpl(Add_ServicesRepository repository) {
        this.repository = repository;
    }

    @Override
    public Add_services save(Add_services add_services) {
        return repository.save(add_services);
    }

    @Override
    public List<Add_services> findAll() {
        return (List<Add_services>) repository.findAll();
    }
}
