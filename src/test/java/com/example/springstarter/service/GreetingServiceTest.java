package com.example.springstarter.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingServiceTest {
  private GreetingService greetingService;

  @BeforeEach
  void setup() {
    greetingService = new GreetingService();
  }

  @Test
  public void shouldReturnHelloWorld() {
    String hello = greetingService.hello();

    assertEquals("Hello World!", hello);
  }
}
