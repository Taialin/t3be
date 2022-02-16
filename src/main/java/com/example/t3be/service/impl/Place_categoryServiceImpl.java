package com.example.t3be.service.impl;

import com.example.t3be.dob.Place_category;
import com.example.t3be.repository.Place_categoryRepository;
import com.example.t3be.service.Place_categoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class Place_categoryServiceImpl implements Place_categoryServices {
    private final Place_categoryRepository repository;

    @Autowired
    public Place_categoryServiceImpl(Place_categoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public Place_category save(Place_category place_category) {
        return repository.save(place_category);
    }

    @Override
    public List<Place_category> findAll() {
        return (List<Place_category>) repository.findAll();
    }
}


