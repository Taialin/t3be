package com.example.t3be.dob;


import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "all_places")
public class All_places {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long place_category;

    private String name_of_place;

    private String image;

    private int age;

    private Date years;

    private String style_of_the_place;

    private Time opening_hours;

    private int place_on_map;

    private String history;

    private String visit_cost;

    private String Link_to_the_site;

    public All_places(Long place_category, String name_of_place, String image, int age, Date years, String style_of_the_place, Time opening_hours, int place_on_map, String history, String visit_cost, String link_to_the_site) {
        this.place_category = place_category;
        this.name_of_place = name_of_place;
        this.image = image;
        this.age = age;
        this.years = years;
        this.style_of_the_place = style_of_the_place;
        this.opening_hours = opening_hours;
        this.place_on_map = place_on_map;
        this.history = history;
        this.visit_cost = visit_cost;
        this.Link_to_the_site = link_to_the_site;
    }

    public All_places() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPlace_category() {
        return place_category;
    }

    public void setPlace_category(Long place_category) {
        this.place_category = place_category;
    }

    public String getName_of_place() {
        return name_of_place;
    }

    public void setName_of_place(String name_of_place) {
        this.name_of_place = name_of_place;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getYears() {
        return years;
    }

    public void setYears(Date telephone) {
        this.years = years;
    }

    public String getStyle_of_the_place() {
        return style_of_the_place;
    }

    public void setStyle_of_the_place(String style_of_the_place) {
        this.style_of_the_place = style_of_the_place;
    }

    public Time getOpening_hours() {
        return opening_hours;
    }

    public void setOpening_hours(Time opening_hours) {
        this.opening_hours = opening_hours;
    }

    public int getPlace_on_map() {
        return place_on_map;
    }

    public void setPlace_on_map(int place_on_map) {
        this.place_on_map = place_on_map;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getVisit_cost() {
        return visit_cost;
    }

    public void setVisit_cost(String visit_cost) {
        this.visit_cost = visit_cost;
    }

    public String getLink_to_the_sitee() {
        return Link_to_the_site;
    }

    public void setLink_to_the_site(String Link_to_the_site) {
        this.Link_to_the_site = Link_to_the_site;
    }

    @Override
    public String toString() {
        return id + " " +
                place_category + " " +
                name_of_place + " " +
                image + " " +
                age + " " +
                years + " " +
                style_of_the_place + " " +
                opening_hours + " " +
                place_on_map + " " +
                history + " " +
                visit_cost + " " +
                Link_to_the_site;
    }
}
