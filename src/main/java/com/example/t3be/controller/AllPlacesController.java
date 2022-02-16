package com.example.t3be.controller;

import com.example.t3be.dob.All_places;
import com.example.t3be.service.All_placesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AllPlacesController {

    @Autowired
    private All_placesServices allPlacesServices;

    @GetMapping("/all_places")
    @CrossOrigin(origins = "*")
    public List<All_places> getAllPlaces() {
        return allPlacesServices.findAll();
    }
}
