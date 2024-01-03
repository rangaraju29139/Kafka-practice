package com.example.kafkapractice.kafka;


import com.example.kafkapractice.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(groupId = "myGroup",topics = "JsonSampleTopic")
    public void consume(User user){
            LOGGER.info(String.format("Recieved message : %s",user.toString()));

    }
}
