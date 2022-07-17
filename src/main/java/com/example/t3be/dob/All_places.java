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

    private String opening_hours;

    private String place_on_map;

    private String history;

    private String visit_cost;

    private String Link_to_the_site;


    private String foto_vnutri;
    private String foto_vid1;
    private String foto_vid2;
    private String foto_vid3;

    public All_places(Long place_category, String name_of_place, String image, int age, Date years, String style_of_the_place, String opening_hours, String place_on_map, String history, String visit_cost, String link_to_the_site, String foto_vnutri, String foto_vid1, String foto_vid2, String foto_vid3) {
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
        this.foto_vnutri =foto_vnutri;
        this.foto_vid1 = foto_vid1;
        this.foto_vid2 = foto_vid2;
        this.foto_vid3 = foto_vid3;
    }

    public All_places() {
    }
    public Long getPlaceID() {
        return id;
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

    public String getOpening_hours() {
        return opening_hours;
    }

    public void setOpening_hours(String opening_hours) {
        this.opening_hours = opening_hours;
    }

    public String getPlace_on_map() {
        return place_on_map;
    }

    public void setPlace_on_map(String place_on_map) {
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
    public String getFoto_vnutri() {
        return foto_vnutri;
    }

    public void setFoto_vnutri(String foto_vnutri) {
        this.visit_cost = foto_vnutri;
    }

    public String getFoto_vid1() {
        return foto_vid1;
    }

    public void setFoto_vid1 (String foto_vid1) {this.foto_vid1 = foto_vid1;}

    public String getFoto_vid2() {
        return foto_vid2;
    }

    public void setFoto_vid2(String foto_vid2) {
        this.visit_cost = foto_vid2;
    }

    public String getFoto_vid3() {
        return foto_vid3;
    }

    public void setFoto_vid3(String foto_vid3) {
        this.visit_cost = foto_vid3;
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
                Link_to_the_site + " " +
                foto_vnutri + " " +
                foto_vid1 + " " +
                foto_vid2 + " " +
                foto_vid3;
    }
}
