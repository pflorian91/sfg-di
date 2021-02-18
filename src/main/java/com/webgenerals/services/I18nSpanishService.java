package com.webgenerals.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * I18nSpanishService
 *
 * @author Florian Popa fpopa1991@gmail.com
 */
@Profile("ES")
@Service("i18nService")
public class I18nSpanishService implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Hello there - Spanish";
  }
}
