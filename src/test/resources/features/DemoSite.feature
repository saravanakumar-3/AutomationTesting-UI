Feature: Automation of ToolsQA demo site

  @Demo
  Scenario: Windows related activities
    When navigate to the 'Sortable Data Tables' page of demo site
    Then validate that Example 1 table contain below data
      | Last Name | First Name | Email                 | Due    | Web Site                 |
      | Bach      | Frank      | fbach@yahoo.com       | $51.00 | http://www.frank.com     |
      | Conway    | Tim        | tconway@earthlink.net | $50.00 | http://www.timconway.com |