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
    printThread();
  }

  private void printThread() {
    System.out.println("--------------------------------------------");
    System.out.println(Thread.currentThread().getName());
    System.out.println(Thread.currentThread().getId());
    System.out.println("--------------------------------------------");
  }

  @Given("test steps")
  public void testSteps() throws InterruptedException {
    Thread.sleep(3000);
    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    System.out.println("Not Tagged");
    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    printThread();
  }
}
