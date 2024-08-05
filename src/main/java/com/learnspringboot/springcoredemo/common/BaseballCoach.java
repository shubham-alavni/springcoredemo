package com.learnspringboot.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

  // Define Constructor
  public BaseballCoach() {
    System.out.println("In Constructor: " + getClass().getSimpleName());
  }

  @Override
  public String getDailyWorkout() {
    return "Spend 30 minutes on batting practice";
  }

}
