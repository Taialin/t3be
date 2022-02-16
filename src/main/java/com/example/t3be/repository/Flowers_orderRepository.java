package com.example.t3be.repository;

import com.example.t3be.dob.Flowers_order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Flowers_orderRepository extends CrudRepository<Flowers_order, Long> {
}

