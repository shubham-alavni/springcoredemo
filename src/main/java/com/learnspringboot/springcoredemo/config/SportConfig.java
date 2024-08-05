package com.learnspringboot.springcoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learnspringboot.springcoredemo.common.Coach;
import com.learnspringboot.springcoredemo.common.SwimCoach;

@Configuration
public class SportConfig {

  // This is the bean id, by default it is the method name
  @Bean("aquatic")
  public Coach swimCoach() {
    return new SwimCoach();
  }
}
