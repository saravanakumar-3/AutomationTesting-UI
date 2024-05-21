package com.automation.config;

import io.cucumber.spring.ScenarioScope;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("!grid")
public class WebDriverConfig {
  @Bean
  @ScenarioScope
  public WebDriver getWebDriver(@Value("${selenium.browser}") String browser) {
    WebDriver driver;
    switch (browser) {
      case "chrome":
        driver = new ChromeDriver();
        break;
      case "firefox":
        driver = new FirefoxDriver();
        break;
      default:
        throw new IllegalArgumentException("Browser '" + browser + "' is not supported");
    }
    driver.manage().window().maximize();
    return driver;
  }
}
