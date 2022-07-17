package com.example.t3be.dob;

import javax.persistence.*;
import java.sql.Time;
import java.text.DecimalFormat;

    @Entity
    @Table(name = "made_trips")
    public class Made_trips {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private Long id;

        private String name_of_the_trip;

        private String description;

        private String script;



        public Made_trips() {
        }

        public Made_trips(Long id, String name_of_the_trip, String description, String script) {
            this.id = id;
            this.name_of_the_trip = name_of_the_trip;
            this.description = description;
            this.script = script;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getname_of_the_trip() {
            return name_of_the_trip;
        }

        public void setname_of_the_trip(String name_of_the_trip) {
            this.name_of_the_trip = name_of_the_trip;
        }

        public String getdescription() {
            return description;
        }

        public void setdescription(String description) {
            this.description = description;
        }

        public String script() {
            return script;
        }

        public void script(String script) {
            this.script = script;
        }



        @Override
        public String toString() {
            return id + " " +
                    name_of_the_trip + " " +
                    description + " " +
                    script;
        }
    }


