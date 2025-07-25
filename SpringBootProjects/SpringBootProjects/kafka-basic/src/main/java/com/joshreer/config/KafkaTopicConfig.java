package com.joshreer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic CreateTopic()
    {
        return new NewTopic("ktopic1", java.util.Optional.empty(), java.util.Optional.empty());
    }
}
