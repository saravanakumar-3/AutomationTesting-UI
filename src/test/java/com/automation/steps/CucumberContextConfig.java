package com.automation.steps;

import com.automation.AutomationTestingUIApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = AutomationTestingUIApplication.class)
public class CucumberContextConfig {}
