package com.example.t3be.repository;

import com.example.t3be.dob.All_places;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface All_placesRepository extends CrudRepository<All_places, Long> {
}

