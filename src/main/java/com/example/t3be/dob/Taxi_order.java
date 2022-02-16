package com.example.t3be.dob;

import javax.persistence.*;
import java.text.DecimalFormat;

@Entity
@Table(name = "taxi_order")
public class Taxi_order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    
    private String order_by_vidget;
    
    private String time_to_send_car;
    
    private DecimalFormat cost;

    public Taxi_order(Long id, String order_by_vidget, String time_to_send_car, DecimalFormat cost) {
        this.id = id;
        this.order_by_vidget = order_by_vidget;
        this.time_to_send_car = time_to_send_car;
        this.cost = cost;
    }

    public Taxi_order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrder_by_vidget() {
        return order_by_vidget;
    }

    public void setOrder_by_vidget(String order_by_vidget) {
        this.order_by_vidget = order_by_vidget;
    }

    public String getTime_to_send_car() {
        return time_to_send_car;
    }

    public void setTime_to_send_car(String time_to_send_car) {
        this.time_to_send_car = time_to_send_car;
    }

    public DecimalFormat getCost() {
        return cost;
    }

    public void setCost(DecimalFormat cost) {
        this.cost = cost;
    }
}
