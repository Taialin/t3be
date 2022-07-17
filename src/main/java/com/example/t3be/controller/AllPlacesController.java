package com.example.t3be.controller;

import com.example.t3be.dob.All_places;
import com.example.t3be.service.All_placesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
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

    @GetMapping("/all_places_cat")
    @CrossOrigin(origins = "*")
    public List<All_places> getAllPlaces(Long category, Long id) {
        return allPlacesServices.findAllByCategory(category) ;

    }

    @GetMapping("/all_places_id")
    @CrossOrigin(origins = "*")
    public List<All_places> getAllPlaces(Long id) {
        return allPlacesServices.findAllById(id);

    }

    @PostMapping("/all_places_ids")
    @CrossOrigin(origins = "*")
    public List<All_places> getAllPlaces(@RequestBody List<Long> ids) {
        return allPlacesServices.findAllByIds(ids);
    }
}
