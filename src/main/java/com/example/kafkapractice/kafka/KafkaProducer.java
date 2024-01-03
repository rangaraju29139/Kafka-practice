package com.example.kafkapractice.kafka;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {


     private KafkaTemplate<String, String> kafkaTemplate;

     private static final Logger LOGGER= LoggerFactory.getLogger(KafkaProducer.class);
     @Autowired
     public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
         this.kafkaTemplate = kafkaTemplate;
     }

     public void sendMessage(String message){
         LOGGER.info(String.format("Message send %s",message));
         kafkaTemplate.send("sampleTopic",message);
     }
}
