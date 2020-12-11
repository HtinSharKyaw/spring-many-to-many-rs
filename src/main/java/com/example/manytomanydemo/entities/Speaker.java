package com.example.manytomanydemo.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String experts;

    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Event> eventList=new ArrayList<>();

    public Speaker(){

    }

    public Speaker(String name, String experts) {
        this.name = name;
        this.experts = experts;
    }

    public List<Event> getEventList() {
        return eventList;
    }

    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExperts() {
        return experts;
    }

    public void setExperts(String experts) {
        this.experts = experts;
    }
}
