package com.nerdllgeek.publisherspring.api.kafka;

import com.nerdllgeek.publisherspring.infra.messageQueue.MessageQueue;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaService {

  private final MessageQueue messageQueue;

  public String publishMessage(KafkaDto kafkaDto) {
    messageQueue.publish(kafkaDto.getMessage());
    return "published";
  }
}
