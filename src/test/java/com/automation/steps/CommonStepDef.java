package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

public class CommonStepDef {
  @Autowired protected HomePage homePage;

  @Given("navigate to the {string} page of demo site")
  public void navigateTo(String page) {
    homePage.launchApplication().navigateTo(page);
  }
}
