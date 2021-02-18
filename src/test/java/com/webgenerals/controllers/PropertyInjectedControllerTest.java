package com.webgenerals.controllers;

import com.webgenerals.services.ConstructorGreetingService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * PropertyInjectedControllerTest
 *
 * @author Florian Popa fpopa1991@gmail.com
 */
public class PropertyInjectedControllerTest {

  PropertyInjectedController controller;

  @BeforeEach
  void setUp() {
    controller = new PropertyInjectedController();
    controller.greetingService = new ConstructorGreetingService();
  }

  @Test
  void getGreeting() {
    System.out.println(controller.getGreeting());
  }

}
