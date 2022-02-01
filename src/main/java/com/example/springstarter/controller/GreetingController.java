package com.example.springstarter.controller;

import com.example.springstarter.service.GreetingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class GreetingController {
  private final GreetingService greetingService;

  @GetMapping("/hello")
  public String hello() {
    return greetingService.hello();
  }
}
