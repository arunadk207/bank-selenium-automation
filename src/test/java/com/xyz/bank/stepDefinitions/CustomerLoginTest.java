package com.xyz.bank.stepDefinitions;

import com.xyz.bank.factory.DriverFactory;
import com.xyz.bank.pages.CustomerLoginPage;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CustomerLoginTest {

    private CustomerLoginPage loginPage;

    @BeforeStep
    public void init() {
        loginPage = new CustomerLoginPage(DriverFactory.getDriver());
    }

    @Given("user is on login page")
    public void user_is_on_login_page() {
        boolean elementPresent = this.loginPage.isElementPresent("Your Name :");
        Assert.assertTrue(elementPresent);
    }
    @When("user selects first customer name")
    public void user_selects_first_customer_name() {
        this.loginPage.selectUserName();
    }
    @When("clicks on Login button")
    public void clicks_on_login_button() {
        this.loginPage.clickOnLoginBtn();
    }
    @Then("user navigates to account page")
    public void user_navigates_to_account_page() {
        boolean logout = this.loginPage.isElementPresent("Logout");
        Assert.assertTrue(logout);
    }
}
