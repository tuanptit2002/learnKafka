package com.example.springboot_kafka_tutorial.controller;

import com.example.springboot_kafka_tutorial.kafka.JsonKafkaProducer;
import com.example.springboot_kafka_tutorial.kafka.KafkaProducer;
import com.example.springboot_kafka_tutorial.payload.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {
    @Autowired
    private KafkaProducer kafkaProducer;

    @Autowired
    JsonKafkaProducer jsonKafkaProducer;
    @GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message){
        kafkaProducer.sendMessage2(message);
        return ResponseEntity.ok("Message send to topic");
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user){
       jsonKafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Message send to topic");
    }
}
