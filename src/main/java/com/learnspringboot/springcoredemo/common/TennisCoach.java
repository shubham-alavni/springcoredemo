package com.learnspringboot.springcoredemo.common;

// import org.springframework.beans.factory.config.ConfigurableBeanFactory;
// import org.springframework.context.annotation.Scope;
// import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // SCOPE_PROTOTYPE creates a
// new instance every time, and by default,
// Spring creates a singleton bean
public class TennisCoach implements Coach {

  // Define Constructor
  public TennisCoach() {
    System.out.println("In Constructor: " + getClass().getSimpleName());
  }

  @Override
  public String getDailyWorkout() {
    return "Practice your backhand volley";
  }

}
