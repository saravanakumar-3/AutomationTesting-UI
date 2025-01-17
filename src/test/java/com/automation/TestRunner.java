package com.automation;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"com.automation.steps"},
    plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json", "me.jvt.cucumber.report.PrettyReports:target"})
public class TestRunner extends AbstractTestNGCucumberTests {
  @Override
  @DataProvider(parallel = true)
  public Object[][] scenarios() {
    return super.scenarios();
  }
}
