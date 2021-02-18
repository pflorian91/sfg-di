package com.webgenerals.controllers;

import com.webgenerals.services.GreetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * SetterInjectedController
 *
 * @author Florian Popa fpopa1991@gmail.com
 */
@Controller
public class SetterInjectedController {

  private GreetingService greetingService;

  public String getGreeting() {
    return greetingService.sayGreeting();
  }

  @Qualifier("setterGreetingService")
  @Autowired
  public void setGreetingService(GreetingService greetingService) {
    this.greetingService = greetingService;
  }
}
