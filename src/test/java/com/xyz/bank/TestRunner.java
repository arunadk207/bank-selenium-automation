package com.xyz.bank;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features/a_home.feature",
                "src/test/resources/Features/b_customer-login.feature",
                "src/test/resources/Features/c_account-page.feature",
                "src/test/resources/Features/d_logout.feature",
                "src/test/resources/Features/e_bank_manager_login.feature"}
        , glue = {"com.xyz.bank.stepDefinitions"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
