package com.example.kafkapractice.kafka;

import com.example.kafkapractice.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaProducer {
    private static final Logger LOGGER  = LoggerFactory.getLogger(JsonKafkaProducer.class);


    private  KafkaTemplate<String, User> kafkaTemplate;

    private JsonKafkaProducer(KafkaTemplate<String, User> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }


    public void sendMessage(User user){
        Message<User> message = MessageBuilder.withPayload(user)
                .setHeader(KafkaHeaders.TOPIC,"JsonSampleTopic").build();
        LOGGER.info(String.format("Message sent : %s",user.toString()));
        kafkaTemplate.send(message);
    }
}
