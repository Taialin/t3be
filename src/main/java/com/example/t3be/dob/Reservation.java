package com.example.t3be.dob;

import javax.persistence.*;
import java.text.DecimalFormat;

@Entity
@Table(name = "reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    
    private String link_to_order;
    
    private DecimalFormat cost;

    public Reservation() {
    }

    public Reservation(Long id, String link_to_order, DecimalFormat cost) {
        this.id = id;
        this.link_to_order = link_to_order;
        this.cost = cost;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLink_to_order() {
        return link_to_order;
    }

    public void setLink_to_order(String link_to_order) {
        this.link_to_order = link_to_order;
    }

    public DecimalFormat getCost() {
        return cost;
    }

    public void setCost(DecimalFormat cost) {
        this.cost = cost;
    }


}


