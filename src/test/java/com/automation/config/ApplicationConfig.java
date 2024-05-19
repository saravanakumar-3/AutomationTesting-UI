package com.automation.config;

import io.cucumber.spring.ScenarioScope;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
  @Value("${selenium.browser}")
  private String browser;

//  @Bean
//  @ScenarioScope
//  public WebDriver getWebDriver() {
//    switch (browser) {
//      case "chrome":
//        return new ChromeDriver();
//      case "firefox":
//        return new FirefoxDriver();
//      default:
//        throw new IllegalArgumentException("Browser '" + browser + "' is not supported");
//    }
//  }
}
