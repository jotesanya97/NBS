Feature: Produce an automated test case using Cypress, Selenium or a similar framework which
  demonstrate one of the bugs that you found.

  @FrontendTest
  Scenario Outline: Bug title: BG -5 – user is unable to create a to do list item when the system date is today’s date
    Given I navigate to the NBS To Do list website
    And I enter a To Do list description with more than one hundred "<characters>"
    When I select the Create to do button
    Then I verify that to do list item has been created successfully "<characters>"

    Examples:
    |    characters                                                                                                             |
    |  wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww                    |
    |  wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww|

