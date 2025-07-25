package com.joshreer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSimpleProducer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaSimpleProducer.class);
    private KafkaTemplate<String, String> kafkaTemplate;

    public KafkaSimpleProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void publishMessage(String message)
    {
        kafkaTemplate.send("ktopic1", message);
        LOGGER.info(String.format("Message published to topic: %s", message));
    }

}
