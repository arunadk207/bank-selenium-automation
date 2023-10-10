package com.xyz.bank.stepDefinitions;

import com.xyz.bank.factory.DriverFactory;
import com.xyz.bank.pages.BankManagerLoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BankManagerLoginPageTest {

    private BankManagerLoginPage bankManagerLoginPage;

    public BankManagerLoginPageTest() {
        this.bankManagerLoginPage = new BankManagerLoginPage(DriverFactory.getDriver());
    }

    @Given("the bank login url (.*)")
    public void the_bank_login_url(String dataTable) {
        System.out.println("Login url: " + dataTable);
    }

    @Then("bank application is launched")
    public void bank_application_is_launched() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        // Write code here that turns the phrase above into concrete actions
    }
}
