package com.automation.steps;

import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Value;

public class MyStepdefs {
  @Value("${application.url}")
  private String url;

  @Given("test step")
  public void testStep() {
    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    System.out.println("Tagged");
    System.out.println(url);
    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
  }

  @Given("test steps")
  public void testSteps() {
    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    System.out.println("Not Tagged");
    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
  }
}
