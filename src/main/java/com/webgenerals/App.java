package com.webgenerals;

import com.webgenerals.controllers.ConstructorInjectedController;
import com.webgenerals.controllers.I18nController;
import com.webgenerals.controllers.MyController;
import com.webgenerals.controllers.PropertyInjectedController;
import com.webgenerals.controllers.SetterInjectedController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 */
@SpringBootApplication
public class App {

  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(App.class, args);

    I18nController i18nController = (I18nController) ctx.getBean("i18nController");
    System.out.println(i18nController.sayHello());

    MyController myController = (MyController) ctx.getBean("myController");
    System.out.println(myController.sayHello());

    PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
    System.out.println(propertyInjectedController.getGreeting());

    SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
    System.out.println(setterInjectedController.getGreeting());

    ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx
        .getBean("constructorInjectedController");
    System.out.println(constructorInjectedController.getGreeting());
  }
}
