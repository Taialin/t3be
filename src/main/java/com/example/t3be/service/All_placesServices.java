package com.example.t3be.service;

import com.example.t3be.dob.All_places;

import java.math.BigInteger;
import java.util.List;

public interface All_placesServices {
    All_places save(All_places all_places);

    List<All_places> findAll();

    List<All_places> findAllByCategory(Long categoryId);
    List<All_places> findAllById(Long IdId);
    List<All_places> findAllByIds(List<Long> ids);


}

