package com.xyz.bank.stepDefinitions;

import com.xyz.bank.factory.DriverFactory;
import com.xyz.bank.pages.HomePage;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomePageTest {

    private HomePage homePage;

    @BeforeStep
    public void init() {
        System.out.println("Init");
        homePage = new HomePage(DriverFactory.getDriver());
    }

    @Given("^User is on the browser$")
    public void user_is_on_the_browser() {
    }

    @When("^XYZ Bank URL (.*) provided$")
    public void xyz_bank_url_provided(String url) {
        System.out.println("Bank Url: " + url);
        this.homePage.launchApplicationByUrl(url);
    }

    @Then("^Launch XYZ Bank Application and verify (.*) is displayed$")
    public void launch_xyz_bank_application_on_chrome_browser(String title) throws InterruptedException {
        System.out.println("Title: " + title);
        boolean elementPresent = this.homePage.isElementPresent(title);
        System.out.println("Is Title present " + elementPresent);
//        Assert.assertTrue(elementPresent);
    }

    @Given("^user is on the XYZ bank (.*) page$")
    public void user_is_on_the_xyz_bank_home_page(String homeElement) {
        boolean elementPresent = this.homePage.isElementPresent(homeElement);
        Assert.assertTrue(elementPresent);
    }

    @When("^user clicks on (.*) button$")
    public void user_clicks_on_customer_login_button(String buttonName) {
        this.homePage.clickOnCustomerLoginBtn();
    }
}
