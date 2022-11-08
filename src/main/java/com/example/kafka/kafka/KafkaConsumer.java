package com.example.kafka.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    
    @KafkaListener(topics = "test-topic", groupId = "test-group")
    public void consumer(String message) {
        System.out.println(String.format("consumer message: %s", message));
    }
}
