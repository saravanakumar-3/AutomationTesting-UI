package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"steps"},
    plugin = {
      "pretty",
      "json:target/cucumber-reports/Cucumber.json",
      "me.jvt.cucumber.report.PrettyReports:target"
    })
public class TestRunner extends AbstractTestNGCucumberTests {}
