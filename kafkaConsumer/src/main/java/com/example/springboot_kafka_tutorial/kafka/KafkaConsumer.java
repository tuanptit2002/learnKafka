package com.example.springboot_kafka_tutorial.kafka;

import com.example.springboot_kafka_tutorial.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class KafkaConsumer {

    private static  final Logger LOGGER =  LoggerFactory.getLogger(KafkaConsumer.class);


    @KafkaListener(topics = "ptit", groupId = "myGroup")
    public void consume(String message){
        LOGGER.info(String.format("Message send %s ", message));
        System.out.println(message);
    }
    @KafkaListener(topics = "tuanptit", groupId = "myGroup")
    public void consume2(User user){
        LOGGER.info(String.format("Message send %s ", user));
        System.out.println(user);
    }
}
