package com.example.manytomanydemo.dao;

import com.example.manytomanydemo.entities.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventDao extends CrudRepository<Event,Integer> {
}