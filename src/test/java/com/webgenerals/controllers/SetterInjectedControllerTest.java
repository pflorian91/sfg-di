package com.webgenerals.controllers;

import com.webgenerals.services.ConstructorGreetingService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * SetterInjectedController
 *
 * @author Florian Popa fpopa1991@gmail.com
 */
public class SetterInjectedControllerTest {

  SetterInjectedController controller;

  @BeforeEach
  void setUp() {
    controller = new SetterInjectedController();
    controller.setGreetingService(new ConstructorGreetingService());
  }

  @Test
  void getGreeting() {
    System.out.println(controller.getGreeting());
  }

}
