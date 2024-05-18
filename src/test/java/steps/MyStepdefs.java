package steps;

import io.cucumber.java.en.Given;

public class MyStepdefs {
  @Given("test step")
  public void testStep() {
    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    System.out.println("Tagged");
    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
  }

  @Given("test steps")
  public void testSteps() {
    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    System.out.println("Not Tagged");
    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
  }
}
