package com.example.t3be.service.impl;

import com.example.t3be.dob.Reservation;
import com.example.t3be.repository.ReservationRepository;
import com.example.t3be.service.ReservationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ReservationServiceIpml implements ReservationServices {
    private final ReservationRepository repository;

    @Autowired
    public ReservationServiceIpml(ReservationRepository repository) {
        this.repository = repository;
    }

    @Override
    public Reservation save(Reservation reservation) {
        return repository.save(reservation);
    }

    @Override
    public List<Reservation> findAll() {
        return (List<Reservation>) repository.findAll();
    }
}


