package com.webgenerals.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * PrimaryGreetingService
 *
 * @author Florian Popa fpopa1991@gmail.com
 */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Hello World - From the Primary bean";
  }
}
