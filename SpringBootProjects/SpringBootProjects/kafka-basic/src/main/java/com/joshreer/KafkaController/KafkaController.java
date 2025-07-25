package com.joshreer.KafkaController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.joshreer.service.KafkaSimpleProducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class KafkaController 
{
    @Autowired
    KafkaSimpleProducer kafkaSimpleProducer;
    
    public KafkaController(KafkaSimpleProducer kafkaSimpleProducer) {
        this.kafkaSimpleProducer = kafkaSimpleProducer;
    }

    @GetMapping()
    public String PublishMessage(@RequestParam("message") String message)
    {
        kafkaSimpleProducer.publishMessage(message);
        return "Message Published";
    }
}
