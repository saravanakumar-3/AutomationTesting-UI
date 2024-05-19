package com.automation.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HomePage extends BasePage {
  public HomePage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(driver, this);
  }

  @Value("${selenium.url}")
  private String url;

  @FindBy(xpath = "//ul/li/a")
  public List<WebElement> examples;

  public HomePage launchApplication() {
    driver.get(url);
    return this;
  }

  public void navigateTo(String page) {
    examples.stream().filter(ele -> ele.getText().equalsIgnoreCase(page)).findFirst().get().click();
  }
}
