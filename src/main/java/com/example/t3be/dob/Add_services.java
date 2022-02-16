package com.example.t3be.dob;

import javax.persistence.*;

@Entity
@Table(name = "add_serv")
public class Add_services {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    
    private int flowers_order;
    
    private int reservation;
    
    private int taxi_order;
    
    private int юhings_reservation;

    public Add_services() {
    }

    public Add_services(int flowers_order, int reservation, int taxi_order, int юhings_reservation) {
        this.flowers_order = flowers_order;
        this.reservation = reservation;
        this.taxi_order = taxi_order;
        this.юhings_reservation = юhings_reservation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getFlowers_order() {
        return flowers_order;
    }

    public void setFlowers_order(int flowers_order) {
        this.flowers_order = flowers_order;
    }

    public int getReservation() {
        return reservation;
    }

    public void setReservation(int reservation) {
        this.reservation = reservation;
    }

    public int getTaxi_order() {
        return taxi_order;
    }

    public void setTaxi_order(int taxi_order) {
        this.taxi_order = taxi_order;
    }

    public int getЮhings_reservation() {
        return юhings_reservation;
    }

    public void setЮhings_reservation(int юhings_reservation) {
        this.юhings_reservation = юhings_reservation;
    }


    @Override
    public String toString() {
        return id + " " +
                flowers_order + " " +
                reservation + " " +
                taxi_order + " " +
                юhings_reservation;
    }

}
