package com.learnspringboot.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component // This annotation tells Spring to scan this class and create a bean for it
           // makes available for dependency injection
public class CricketCoach implements Coach {

  @Override
  public String getDailyWorkout() {
    return "Practice fast bowling for 15 minutes!!";
  }

}
