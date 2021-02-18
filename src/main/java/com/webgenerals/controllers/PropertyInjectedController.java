package com.webgenerals.controllers;

import com.webgenerals.services.GreetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * PropertyInjectedController
 *
 * @author Florian Popa fpopa1991@gmail.com
 */
@Controller
public class PropertyInjectedController {

  @Autowired
  @Qualifier("propertyGreetingService")
  public GreetingService greetingService;

  public String getGreeting() {
    return greetingService.sayGreeting();
  }

}
