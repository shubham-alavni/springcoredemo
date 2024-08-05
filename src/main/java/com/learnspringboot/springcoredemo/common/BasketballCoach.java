package com.learnspringboot.springcoredemo.common;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class BasketballCoach implements Coach {

  @PostConstruct
  public void doMyStartupStuff() {
    System.out.println("BasketballCoach: inside method doMyStartupStuff");
  }

  @PreDestroy
  public void doMyCleanupStuff() {
    System.out.println("BasketballCoach: inside method doMyCleanupStuff");
  }

  @Override
  public String getDailyWorkout() {
    return "Practice your jump shot";
  }

}
