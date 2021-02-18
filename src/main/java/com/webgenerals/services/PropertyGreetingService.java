package com.webgenerals.services;

import org.springframework.stereotype.Service;

/**
 * PropertyGreetingService
 *
 * @author Florian Popa fpopa1991@gmail.com
 */
@Service
public class PropertyGreetingService implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Hello World - Property";
  }
}
