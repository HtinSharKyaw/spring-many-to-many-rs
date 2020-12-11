package com.example.manytomanydemo.service;

import com.example.manytomanydemo.dao.EventDao;
import com.example.manytomanydemo.dao.SpeakerDao;
import com.example.manytomanydemo.entities.Event;
import com.example.manytomanydemo.entities.Speaker;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SpeakerService {
    private final EventDao eventDao;
    private final SpeakerDao speakerDao;

    public SpeakerService(EventDao eventDao, SpeakerDao speakerDao) {
        this.eventDao = eventDao;
        this.speakerDao = speakerDao;
    }

    @Transactional
    public void createDb(){
        Event event1 = new Event("Java","Tokyo","Japan");
        Event event2 = new Event("Spring","Osaka","Japan");
        Event event3 = new Event("PHP","NewYork","USA");

        Speaker speaker1 = new Speaker("John","Java");
        Speaker speaker2 = new Speaker("Willian","PHP");
        Speaker speaker3 = new Speaker("David","Spring");

        speaker1.getEventList().add(event1);
        event1.getSpeakerList().add(speaker1);

        speaker3.getEventList().add(event1);
        event1.getSpeakerList().add(speaker3);

        speaker2.getEventList().add(event1);
        event1.getSpeakerList().add(speaker2);

        event2.getSpeakerList().add(speaker3);
        speaker3.getEventList().add(event2);

        event3.getSpeakerList().add(speaker2);
        speaker2.getEventList().add(event3);

        speakerDao.save(speaker1);
        speakerDao.save(speaker2);
        speakerDao.save(speaker3);


    }
}

