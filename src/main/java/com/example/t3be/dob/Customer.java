package com.example.t3be.dob;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String surname;

    private String sex;

    private int age;

    private String telephone;

    private int card;

    private String geolocation;

    public Customer() {
    }

    public Customer(String name, String surname, String sex, int age, String telephone, int card, String geolocation, int order) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
        this.telephone = telephone;
        this.card = card;
        this.geolocation = geolocation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getCard() {
        return card;
    }

    public void setCard(int card) {
        this.card = card;
    }

    public String getGeolocation() {
        return geolocation;
    }

    public void setGeolocation(String geolocation) {
        this.geolocation = geolocation;
    }

    @Override
    public String toString() {
        return id + " " +
                name + " " +
                surname + " " +
                sex + " " +
                age + " " +
                telephone + " " +
                card + " " +
                geolocation + " "
                ;
    }
}

