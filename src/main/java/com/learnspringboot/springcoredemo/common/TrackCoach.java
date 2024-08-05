package com.learnspringboot.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

// @Primary
@Component
@Lazy // This annotation tells Spring to create the bean only when it is needed
public class TrackCoach implements Coach {

  // Define Constructor
  public TrackCoach() {
    System.out.println("In Constructor: " + getClass().getSimpleName());
  }

  @Override
  public String getDailyWorkout() {
    return "Run a hard 5k";
  }

}
