package com.example.t3be.service;

import com.example.t3be.dob.Reservation;

import java.util.List;

public interface ReservationServices {
    Reservation save(Reservation reservation);

    List<Reservation> findAll();
}




