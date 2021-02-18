package com.webgenerals.controllers;

import com.webgenerals.services.ConstructorGreetingService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * ConstructorInjectedControllerTest
 *
 * @author Florian Popa fpopa1991@gmail.com
 */
class ConstructorInjectedControllerTest {

  ConstructorInjectedController controller;

  @BeforeEach
  void setUp() {
    controller = new ConstructorInjectedController(new ConstructorGreetingService());
  }

  @Test
  void getGreeting() {
    System.out.println(controller.getGreeting());
  }
}