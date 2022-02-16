package com.example.t3be.dob;


import javax.persistence.*;
import java.sql.Time;
import java.text.DecimalFormat;

@Entity
@Table(name = "flowers_order")
public class Flowers_order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    
    private String flowers;
    
    private Time time_add;
    
    private int way_how_to_take_it;
    
    private DecimalFormat cost;

    public Flowers_order() {
    }

    public Flowers_order(Long id, String flowers, Time time_add, int way_how_to_take_it, DecimalFormat cost) {
        this.id = id;
        this.flowers = flowers;
        this.time_add = time_add;
        this.way_how_to_take_it = way_how_to_take_it;
        this.cost = cost;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlowers() {
        return flowers;
    }

    public void setFlowers(String place_category) {
        this.flowers = flowers;
    }

    public Time getTime_add() {
        return time_add;
    }

    public void setTime_add(Time time_add) {
        this.time_add = time_add;
    }

    public int getWay_how_to_take_it() {
        return way_how_to_take_it;
    }

    public void setWay_how_to_take_it(int way_how_to_take_it) {
        this.way_how_to_take_it = way_how_to_take_it;
    }

    public DecimalFormat getCost() {
        return cost;
    }

    public void setCost(DecimalFormat cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return id + " " +
                flowers + " " +
                time_add + " " +
                way_how_to_take_it + " " +
                cost;
    }
}
