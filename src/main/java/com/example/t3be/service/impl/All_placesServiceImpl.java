package com.example.t3be.service.impl;

import com.example.t3be.dob.All_places;
import com.example.t3be.repository.All_placesRepository;
import com.example.t3be.service.All_placesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class All_placesServiceImpl implements All_placesServices {
    private final All_placesRepository repository;

    @Autowired
    public All_placesServiceImpl(All_placesRepository repository) {
        this.repository = repository;
    }

    @Override
    public All_places save(All_places all_places) {
        return repository.save(all_places);
    }

    @Override
    public List<All_places> findAll() {
        return (List<All_places>) repository.findAll();
    }
}

