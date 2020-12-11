package com.example.manytomanydemo.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//Many To Many
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String eventName;
    private String location;
    private String country;

    @ManyToMany(mappedBy = "eventList")
    private List<Speaker> speakerList=new ArrayList<>();

    public Event(){

    }

    public Event(String eventName, String location, String country) {
        this.eventName = eventName;
        this.location = location;
        this.country = country;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Speaker> getSpeakerList() {
        return speakerList;
    }

    public void setSpeakerList(List<Speaker> speakerList) {
        this.speakerList = speakerList;
    }
}
