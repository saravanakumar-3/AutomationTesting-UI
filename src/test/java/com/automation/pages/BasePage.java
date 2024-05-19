package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;

public class BasePage {
  protected WebDriver driver = new ChromeDriver();
}
