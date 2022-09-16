package com.nerdllgeek.publisherspring.infra.messageQueue;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class KafkaProducer implements MessageQueue {

  private final KafkaTemplate<String, String> kafkaTemplate;

  @Override
  public void publish(String message){
    kafkaTemplate.send("DEFAULT_TOPIC", message);
  }

  @Override
  public void publish(String topic, String message){
    kafkaTemplate.send(topic, message);
  }
}
