Feature: XYZ Bank Login feature
  Scenario Outline: Launch XYZ Bank application
    Given User is on the browser
    When XYZ Bank URL <bank-url> provided
    Then Launch XYZ Bank Application and verify <title> is displayed
    Examples:
      |bank-url|title|
      |https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login|XYZ Bank|

  Scenario Outline: Customer login
    Given user is on the XYZ bank <home> page
    When user clicks on <customer-login> button
    Then use is navigated to the home page
    Examples:
      |home|customer-login|
      |Home|Customer Login|





