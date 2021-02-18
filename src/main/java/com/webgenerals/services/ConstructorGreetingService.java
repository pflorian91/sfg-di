package com.webgenerals.services;

import org.springframework.stereotype.Service;

/**
 * GreetingServiceImpl
 *
 * @author Florian Popa fpopa1991@gmail.com
 */
@Service
public class ConstructorGreetingService implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Hello World - Constructor";
  }
}
