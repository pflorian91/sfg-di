package com.webgenerals.services;

import org.springframework.stereotype.Service;

/**
 * SetterGreetingService
 *
 * @author Florian Popa fpopa1991@gmail.com
 */
@Service
public class SetterGreetingService implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Hello World - Setter";
  }
}
