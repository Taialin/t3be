package com.example.t3be.repository;

import com.example.t3be.dob.Place_category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Place_categoryRepository extends CrudRepository<Place_category, Long> {
}

