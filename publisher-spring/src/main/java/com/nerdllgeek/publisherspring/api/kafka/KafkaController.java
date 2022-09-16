package com.nerdllgeek.publisherspring.api.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/kafka")
public class KafkaController {
  private final KafkaService kafkaService;

  @PostMapping("/messages")
  public String publishMessage(@RequestBody KafkaDto kafkaDto){
    return kafkaService.publishMessage(kafkaDto);
  }
}
