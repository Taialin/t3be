package com.example.t3be.service;

import com.example.t3be.dob.Add_services;

import java.util.List;

public interface Add_ServicesServices {
    Add_services save(Add_services add_services);

    List<Add_services> findAll();
}
