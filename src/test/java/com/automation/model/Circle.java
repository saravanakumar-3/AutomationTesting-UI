package com.automation.model;

import io.cucumber.spring.ScenarioScope;
import org.springframework.stereotype.Component;

@Component
@ScenarioScope
public class Circle {
  private String store = "Initial Value";

  public Circle() {
    System.out.println("circle instance created");
  }

  public String getStore() {
    return store;
  }

  public void setStore(String store) {
    this.store = store;
  }

  public void printStore() {
    System.out.println("Store: " + store);
  }
}
