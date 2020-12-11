package com.example.manytomanydemo.dao;

import com.example.manytomanydemo.entities.Speaker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpeakerDao extends CrudRepository<Speaker,Integer> {
}
