package com.example.t3be.service;

import com.example.t3be.dob.Place_category;

import java.util.List;

public interface Place_categoryServices {
    Place_category save(Place_category place_category);

    List<Place_category> findAll();
}


