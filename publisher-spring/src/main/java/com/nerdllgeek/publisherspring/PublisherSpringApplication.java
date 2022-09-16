package com.nerdllgeek.publisherspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.nerdllgeek.*")
public class PublisherSpringApplication {

  public static void main(String[] args) {
    SpringApplication.run(PublisherSpringApplication.class, args);
  }

}
