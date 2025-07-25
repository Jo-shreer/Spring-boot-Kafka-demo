package com.joshreer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaSimpleConsumer {

    private final static Logger LOGGER = LoggerFactory.getLogger(KafkaSimpleConsumer.class);

    @KafkaListener(topics = "ktopic1", groupId = "my-group")
    public void consumeMessage(String message)
    {
        LOGGER.info(String.format("Message consumed  topic: %s", message));
    }

}
