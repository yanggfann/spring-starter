package com.example.springstarter.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.example.springstarter.service.GreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class GreetingControllerTest {
  @Mock private GreetingService greetingService;

  private GreetingController greetingController;

  @BeforeEach
  void setup() {
    greetingController = new GreetingController(greetingService);
  }

  @Test
  public void shouldReturnHelloWorld() {
    when(greetingService.hello()).thenReturn("hello");

    String hello = greetingController.hello();

    assertEquals("hello", hello);
  }
}
