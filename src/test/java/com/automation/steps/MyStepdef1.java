package com.automation.steps;

import com.automation.model.Circle;
import io.cucumber.java.en.Given;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;

public class MyStepdef1 {
  @Autowired private Circle circle;

  @Given("step1 {string}")
  public void testStep(String value) throws InterruptedException {

    new ChromeDriver();
    if (value.equals("stop")) Thread.sleep(2000);
    circle.printStore();
    circle.setStore(value);
    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    circle.printStore();
    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
  }

  private void printThread() {
    System.out.println("--------------------------------------------");
    System.out.println(Thread.currentThread().getName());
    System.out.println(Thread.currentThread().getId());
    System.out.println("--------------------------------------------");
  }
}
