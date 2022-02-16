package com.example.t3be.dob;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String map;
    private Date date;
    
    private int numbOfPeple;
    private int cost;
    private Long customer;
    
    private int addServ;
    private int payment;
    
    private int trip;
    
    private int customerPlaces;
    
    private int flowerOrde;
    
    private int taxiOrder;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNumbOfPeple() {
        return numbOfPeple;
    }

    public void setNumbOfPeple(int numberOfPeople) {
        this.numbOfPeple = numberOfPeople;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Long getCustomer() {
        return customer;
    }

    public void setCustomer(Long customer) {
        this.customer = customer;
    }

    public int getAddServ() {
        return addServ;
    }

    public void setAddServ(int addServ) {
        this.addServ = addServ;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public int getTrip() {
        return trip;
    }

    public void setTrip(int trip) {
        this.trip = trip;
    }

    public int getCustomerPlaces() {
        return customerPlaces;
    }

    public void setCustomerPlaces(int customerPlaces) {
        this.customerPlaces = customerPlaces;
    }

    public int getFlowerOrde() {
        return flowerOrde;
    }

    public void setFlowerOrde(int flowerOrder) {
        this.flowerOrde = flowerOrder;
    }

    public int getTaxiOrder() {
        return taxiOrder;
    }

    public void setTaxiOrder(int taxiOrder) {
        this.taxiOrder = taxiOrder;
    }

    @Override
    public String toString() {
        return id + " " +
                map + " " +
                date + " " +
                numbOfPeple + " " +
                cost + " " +
                customer + " " +
                addServ + " " +
                payment + " " +
                trip + " " +
                customerPlaces + " " +
                flowerOrde + " " +
                taxiOrder;
    }
}
