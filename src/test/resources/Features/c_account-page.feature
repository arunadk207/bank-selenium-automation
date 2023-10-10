Feature: Account Page
  Scenario: Customer default account number and balance validation
    Given customer is signed in and navigated to account page
    When default account number is selected
    Then account number and balance is displayed

  Scenario: Amount Deposit
    Given Customer is on account page
    When default account is already selected
    And customer clicks on deposit button
    Then amount to be deposited to be displayed
    And deposit button should be rendered
    And enter deposit amount
    And click on deposit button
    Then verify the total account balance

  Scenario: Amount Withdraw
    Given Customer is on account page
    When default account is already selected
    And customer clicks on withdrawl button
    Then amount to be withdrawn to be displayed
    And enter withdraw amount
    And click on withdraw button
    Then verify the total account balance after withdrawl

  Scenario: Verify Transactions
    Given customer is on account page to verify transaction
    When user find the transactions button
    And click on Transactions button
    Then verify that transactions are displayed

