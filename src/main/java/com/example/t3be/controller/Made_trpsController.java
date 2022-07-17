package com.example.t3be.controller;

import com.example.t3be.dob.Made_trips;
import com.example.t3be.service.Made_tripsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Made_trpsController {

    @Autowired
    private Made_tripsServices made_tripsServices;

    @GetMapping("/made_trips")
    @CrossOrigin(origins = "*")
    public List<Made_trips> getMade_trips() {
        return made_tripsServices.findAll();
    }
}
