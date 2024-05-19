package com.automation.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

@Component
public class TablesPage extends BasePage {
  public TablesPage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(driver, this);
  }

  @FindBy(xpath = "//table[@id='table1']/thead/tr/th")
  public List<WebElement> tableHeader;

  public String tableRowData = "//table[@id='table1']/tbody/tr";

  public List<String> getTableHeaders() {
    return tableHeader.stream().map(WebElement::getText).collect(Collectors.toList());
  }

  public List<List<String>> getTableData() {
    int noOfRows = driver.findElements(By.xpath(tableRowData)).size();
    List<List<String>> data = new ArrayList<>();
    for (int i = 1; i <= noOfRows; i++) {
      String tableData = tableRowData + "[" + i + "]/td";
      List<String> rowData =
          driver.findElements(By.xpath(tableData)).stream()
              .map(WebElement::getText)
              .collect(Collectors.toList());
      data.add(rowData);
    }
    return data;
  }
}
