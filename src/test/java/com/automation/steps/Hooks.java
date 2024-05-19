package com.automation.steps;

import io.cucumber.java.After;

public class Hooks {
  @After
  public void afterScenario() {
    System.out.println("==================================================");
  }
}
