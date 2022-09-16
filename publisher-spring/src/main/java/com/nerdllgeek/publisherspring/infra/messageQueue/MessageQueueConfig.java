package com.nerdllgeek.publisherspring.infra.messageQueue;

import java.util.HashMap;
import java.util.Map;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.internals.Topic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

@Configuration
public class MessageQueueConfig {

  @Bean
  public NewTopic defaultTopic(){
    return new NewTopic("DEFAULT_TOPIC", 1, (short) 1);
  }
}
