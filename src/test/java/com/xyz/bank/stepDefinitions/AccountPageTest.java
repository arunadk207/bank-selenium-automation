package com.xyz.bank.stepDefinitions;

import com.xyz.bank.factory.DriverFactory;
import com.xyz.bank.pages.AccountPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.math.BigDecimal;

public class AccountPageTest {

    private AccountPage accountPage;

    public AccountPageTest() {
        this.accountPage = new AccountPage(DriverFactory.getDriver());
    }

    @Given("customer is signed in and navigated to account page")
    public void customer_is_signed_in_and_navigated_to_account_page() throws InterruptedException {
        Thread.sleep(5000);
        boolean elementPresent = this.accountPage.isElementPresent("Account Number : ");
        Assert.assertTrue(elementPresent);

//        WebElement accountNumberElement = webDriver.findElement(By.xpath("//*[text()='Account Number : ']/strong[1]"));
//        assert accountNumberElement.isDisplayed();
//        String accountNumber = accountNumberElement.getText();
//        System.out.println("Account Number " + accountNumber);
//        assert accountNumber.equals("1001");
    }

    @When("default account number is selected")
    public void default_account_number_is_selected() {
        String accountNumber = this.accountPage.getAccountNumber();
        Assert.assertEquals("1001", accountNumber);
    }

    @Then("account number and balance is displayed")
    public void account_number_and_balance_is_displayed() {
        String accountBalance = this.accountPage.getAccountBalance();
        Assert.assertEquals("5096", accountBalance);
    }

    @Given("Customer is on account page")
    public void customer_is_on_account_page() {
    }

    @When("default account is already selected")
    public void default_account_is_already_selected() {
    }

    @When("customer clicks on deposit button")
    public void customer_clicks_on_deposit_button() {
        this.accountPage.clickOnDepositBtn();
    }

    @Then("amount to be deposited to be displayed")
    public void amount_to_be_deposited_to_be_displayed() {
        boolean elementPresent = this.accountPage.isElementPresent("Amount to be Deposited :");
        Assert.assertTrue(elementPresent);
    }

    @Then("deposit button should be rendered")
    public void deposit_button_should_be_rendered() {
        boolean deposit = this.accountPage.isDepositButtonDisplayed();
        Assert.assertTrue(deposit);
    }

    @Then("enter deposit amount")
    public void enter_deposit_amount() {
        this.accountPage.enterAmount(new BigDecimal(100));
    }

    @Then("click on deposit button")
    public void click_on_deposit_button() {
        this.accountPage.clickOnDepositSubmitButton();
    }

    @Then("verify the total account balance")
    public void verify_the_total_account_balance() {
        String accountBalance = this.accountPage.getAccountBalance();
        Assert.assertEquals("5196", accountBalance);
    }

    @When("customer clicks on withdrawl button")
    public void customer_clicks_on_withdrawl_button() {
        boolean withdrawlButtonDisplayed = this.accountPage.isWithdrawlButtonDisplayed();
        Assert.assertTrue(withdrawlButtonDisplayed);
        this.accountPage.clickOnWithdrawlButton();
    }

    @Then("amount to be withdrawn to be displayed")
    public void amount_to_be_withdrawn_to_be_displayed() {
        boolean elementPresent = this.accountPage.isElementPresent("Amount to be Withdrawn :");
        Assert.assertTrue(elementPresent);
    }

    @Then("enter withdraw amount")
    public void enter_withdraw_amount() {
        this.accountPage.enterAmount(new BigDecimal(100));
    }

    @Then("click on withdraw button")
    public void click_on_withdraw_button() {
        this.accountPage.clickOnWithdrawSubmitButton();
    }

    @Then("verify the total account balance after withdrawl")
    public void verify_the_total_account_balance_after_withdrawl() {
        String accountBalance = this.accountPage.getAccountBalance();
        Assert.assertEquals("5096", accountBalance);
    }

    @Given("customer is on account page to verify transaction")
    public void customer_is_on_account_page_to_verify_transaction() {
        boolean elementPresent = this.accountPage.isElementPresent("Account Number : ");
        Assert.assertTrue(elementPresent);
    }

    @When("user find the transactions button")
    public void user_find_the_transactions_button() {
        boolean transactions = this.accountPage.isElementPresent("Transactions\n" + "\t\t");
        Assert.assertTrue(transactions);

        String currentUrl = this.accountPage.getCurrentUrl();
        Assert.assertEquals("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/account", currentUrl);
    }

    @When("click on Transactions button")
    public void click_on_transactions_button() {
        this.accountPage.clickOnTransactionButton();
    }

    @Then("verify that transactions are displayed")
    public void verify_that_transactions_are_displayed() {
        boolean elementPresent = this.accountPage.isElementPresent("\n" + "            Date-Time\n" + "          ");
        Assert.assertTrue(elementPresent);
    }
}
