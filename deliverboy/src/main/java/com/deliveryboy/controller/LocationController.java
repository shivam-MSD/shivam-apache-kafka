package com.deliveryboy.controller;

import com.deliveryboy.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/location")
public class LocationController {

    @Autowired
    private KafkaService kafkaService;

    @PostMapping
    public ResponseEntity<?> updateLocation()
    {
        String updatedLocation = "(" + Math.floor(Math.random()*100) + "," + Math.floor(Math.random()*100) + ")";
        this.kafkaService.updateLocation(updatedLocation);
        return new ResponseEntity<>(Map.of("message", updatedLocation), HttpStatus.OK);
    }
}
