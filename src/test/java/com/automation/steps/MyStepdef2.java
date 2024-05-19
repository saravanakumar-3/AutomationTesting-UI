package com.automation.steps;

import com.automation.model.Circle;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

public class MyStepdef2 {
  @Autowired private Circle circle;

  @Given("step2")
  public void testSteps() {
    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    circle.printStore();
    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
  }

  private void printThread() {
    System.out.println("--------------------------------------------");
    System.out.println(Thread.currentThread().getName());
    System.out.println(Thread.currentThread().getId());
    System.out.println("--------------------------------------------");
  }
}
