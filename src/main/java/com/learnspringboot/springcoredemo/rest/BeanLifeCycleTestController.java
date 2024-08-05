package com.learnspringboot.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import com.learnspringboot.springcoredemo.common.Coach;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class BeanLifeCycleTestController {
  private Coach basketballCoach;

  // Constructor Injection
  @Autowired
  public BeanLifeCycleTestController(@Qualifier("basketballCoach") Coach theBasketballCoach) {
    basketballCoach = theBasketballCoach;
  }

  @GetMapping("/basketballDailyWorkout")
  public String basketballDailyWorkout() {
    return basketballCoach.getDailyWorkout();
  }

}