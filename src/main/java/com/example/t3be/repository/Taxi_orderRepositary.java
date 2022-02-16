package com.example.t3be.repository;

import com.example.t3be.dob.Taxi_order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Taxi_orderRepositary extends CrudRepository<Taxi_order, Long> {
}
