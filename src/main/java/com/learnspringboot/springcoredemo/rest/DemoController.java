package com.learnspringboot.springcoredemo.rest; // subpackage of com.learnspringboot.springcoredemo

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.learnspringboot.springcoredemo.common.Coach;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class DemoController {

  // Define a private field for the dependency
  private Coach myCoach;

  // Define a constructor for dependency injection
  @Autowired // This annotation tells Spring to inject the dependency
  public DemoController(Coach theCoach) {
    myCoach = theCoach;
  }

  @GetMapping("/dailyworkout")
  public String getDailyWorkout() {
    return myCoach.getDailyWorkout();
  }

}
