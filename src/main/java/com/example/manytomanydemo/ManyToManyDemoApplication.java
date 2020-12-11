package com.example.manytomanydemo;

import com.example.manytomanydemo.service.SpeakerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManyToManyDemoApplication implements CommandLineRunner {
    private final SpeakerService speakerService;

    public ManyToManyDemoApplication(SpeakerService speakerService) {
        this.speakerService = speakerService;
    }

    public static void main(String[] args) {
        SpringApplication.run(ManyToManyDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        speakerService.createDb();
    }
}
