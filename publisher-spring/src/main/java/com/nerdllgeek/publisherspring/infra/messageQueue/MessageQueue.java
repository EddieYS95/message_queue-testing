package com.nerdllgeek.publisherspring.infra.messageQueue;

public interface MessageQueue {

  void publish(String topic, String message);
  void publish(String message);
}
