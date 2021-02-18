package com.webgenerals.controllers;

import com.webgenerals.services.GreetingService;

import org.springframework.stereotype.Controller;

/**
 * MyController
 *
 * @author Florian Popa fpopa1991@gmail.com
 */
@Controller
public class MyController {

  private final GreetingService greetingService;

  public MyController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayHello() {
    return greetingService.sayGreeting();
  }

}
