package com.example.t3be.dob;

import javax.persistence.*;

@Entity
@Table(name = "place_category")
public class Place_category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    
    private String category_of_place;

    public Place_category() {
    }

    public Place_category(Long id, String category_of_place) {
        this.id = id;
        this.category_of_place = category_of_place;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory_of_place() {
        return category_of_place;
    }

    public void setCategory_of_place(String category_of_place) {
        this.category_of_place = category_of_place;
    }
}
