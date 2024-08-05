package com.learnspringboot.springcoredemo.rest; // subpackage of com.learnspringboot.springcoredemo

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import com.learnspringboot.springcoredemo.common.Coach;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class DemoController {

  // Define a private field for the dependency
  private Coach myCoach;
  // private Coach anotherCoach;

  // @Qualifier("tennisCoach") Coach anotherCoach
  // Define a constructor for dependency injection

  @Autowired // This annotation tells Spring to inject the dependency
  public DemoController(@Qualifier("aquatic") Coach theCoach) {
    System.out.println("In Constructor: " + getClass().getSimpleName());
    myCoach = theCoach;
  }

  // define Setter Injection
  // @Autowired
  // public void setMyCoach(Coach theCoach) { // the method name can be anything
  // myCoach = theCoach;
  // System.out.println("Setter Injection");
  // }

  @GetMapping("/dailyworkout")
  public String getDailyWorkout() {
    return myCoach.getDailyWorkout();
  }

  // @GetMapping("/check")
  // public String check() {
  // // by default, Spring creates a singleton bean
  // return "Comparing beans: theCoach == anotherCoach: " + (myCoach ==
  // anotherCoach);
  // }

}
