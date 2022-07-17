package com.example.t3be.controller;

import com.example.t3be.dob.Place_category;
import com.example.t3be.service.Place_categoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlaceCategotyController {

    @Autowired
    private Place_categoryServices place_categoryServices;

    @GetMapping("/place_category")
    @CrossOrigin(origins = "*")
    public List<Place_category> getAllPlaces() {
        return place_categoryServices.findAll();
    }

}
