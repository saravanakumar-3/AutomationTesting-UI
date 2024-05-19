package com.automation.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

import com.automation.pages.TablesPage;
import io.cucumber.java.en.Then;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

public class TableStepDef {
  @Autowired protected TablesPage tablesPage;

  @Then("validate that Example 1 table contain below data")
  public void validateThatExampleTableContainBelowData(List<Map<String, String>> expData) {
    List<String> actHeaders = tablesPage.getTableHeaders();
    expData.get(0).keySet().forEach(s -> assertThat(actHeaders, hasItem(s)));

    List<List<String>> actData = tablesPage.getTableData();

    for (Map<String, String> expRow : expData) {
      List<String> actRow =
          actData.stream()
              .filter(strings -> strings.contains(expRow.get("Last Name")))
              .findFirst()
              .get();
      assertThat(actRow, hasItem(expRow.get("First Name")));
      assertThat(actRow, hasItem(expRow.get("Email")));
      assertThat(actRow, hasItem(expRow.get("Due")));
      assertThat(actRow, hasItem(expRow.get("Web Site")));
    }
  }
}
