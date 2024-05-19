package com.automation.pages;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HomePage extends BasePage {
  @Value("${selenium.url}")
  private String url;

  public HomePage navigateToHomePage() {
    driver.get(url);
    return this;
  }
}
