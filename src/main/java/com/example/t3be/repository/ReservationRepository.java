package com.example.t3be.repository;

import com.example.t3be.dob.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
}


