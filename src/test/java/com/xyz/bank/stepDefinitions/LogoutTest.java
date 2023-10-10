package com.xyz.bank.stepDefinitions;

import com.xyz.bank.factory.DriverFactory;
import com.xyz.bank.pages.AccountPage;
import com.xyz.bank.pages.LogoutPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LogoutTest {


    private LogoutPage logoutPage;

    public LogoutTest() {
        this.logoutPage = new LogoutPage(DriverFactory.getDriver());
    }

    @Given("customer is on account page")
    public void customer_is_on_account_page() {
        boolean elementPresent = this.logoutPage.isElementPresent("Back");
        Assert.assertTrue(elementPresent);
    }

    @When("clicks on logout button")
    public void clicks_on_logout_button() {
        this.logoutPage.clickOnLogoutBtn();
    }

    @Then("customer navigated to login page")
    public void customer_navigated_to_login_page() {
        String currentUrl = this.logoutPage.getCurrentUrl();
        Assert.assertEquals("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer", currentUrl);
    }

    @Then("click on home button")
    public void click_on_home_button() {
        this.logoutPage.clickOnHomeBtn();
    }
}
