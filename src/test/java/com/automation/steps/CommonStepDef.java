package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

public class CommonStepDef {
  @Autowired protected HomePage homePage;

  @Given("I navigate to the {string} page of demo site")
  public void navigateTo(String page) {
    homePage.navigateToHomePage();
  }
}
