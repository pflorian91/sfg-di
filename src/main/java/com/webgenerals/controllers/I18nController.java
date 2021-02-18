package com.webgenerals.controllers;

import com.webgenerals.services.GreetingService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * I18nController
 *
 * @author Florian Popa fpopa1991@gmail.com
 */
@Controller
public class I18nController {

  private final GreetingService greetingService;

  public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayHello() {
    return greetingService.sayGreeting();
  }
}
