package com.xyz.bank.stepDefinitions;

import com.xyz.bank.factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginPageStepDef {
    private WebDriver webDriver = null;

    @Given("^Test User is on the browser$")
    public void user_is_on_the_browser() throws InterruptedException {
        System.out.println("user_is_on_the_browser");
        String path = System.getProperty("user.dir");
        System.out.println(path);
        //System.setProperty("webdriver.chrome.driver", path + "/src/test/resources/drivers/chromedriver.exe");
        webDriver = DriverFactory.getDriver();
        webDriver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/");
        webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @When("^user provides (.*) and (.*)$")
    public void user_provides_username_and_password(String username, String password) {
        System.out.println("user_provides_username_and_password" + username + " " + password);
        WebElement customer_login = webDriver.findElement(By.xpath("//*[text()='Customer Login']"));
        customer_login.click();
        boolean isElementPresent = webDriver.findElement(By.xpath("//*[text()='Your Name :']")).isDisplayed();
        assert isElementPresent;

        Select select = new Select(webDriver.findElement(By.name("userSelect")));
        select.selectByIndex(1);
        WebElement login = webDriver.findElement(By.xpath("//*[text()='Login']"));

        login.click();





        WebElement balanceElement = webDriver.findElement(By.xpath("//*[text()='Account Number : ']/strong[2]"));
        assert balanceElement.isDisplayed();
        String balance = balanceElement.getText();
        System.out.println("Balance " + balance);
        assert balance.equals("5096");

        WebElement depositElement = webDriver.findElement(By.xpath("//button[contains(text(), 'Deposit')]"));
        depositElement.click();

        depositAmount("-100");
        assert !isElementPresent("Deposit Successful");

        depositAmount("0");
        assert !isElementPresent("Deposit Successful");

        depositAmount("100");
        assert isElementPresent("Deposit Successful");
    }

    private boolean isElementPresent(String text) {
        try {
            WebElement webElement = webDriver.findElement(By.xpath(String.format("//*[text()='%s']", text)));
            return webElement.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    private void depositAmount(String amount) {
        WebElement depositAmount = webDriver.findElement(By.xpath("//input[@type='number']"));
        depositAmount.clear();
        depositAmount.sendKeys(amount);

        WebElement depositButton = webDriver.findElement(By.xpath("//button[@type='submit']"));
        depositButton.click();
    }

    @And("user clicks on submit button")
    public void user_clicks_on_submit_button() {
        System.out.println("user_clicks_on_submit_button");

    }

    @Then("use is navigated to the home page")
    public void use_is_navigated_to_the_home_page() throws InterruptedException {
//        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//        Thread.sleep(2000);
//        WebElement logout = webDriver.findElement(By.xpath("//*[text()='Logout']"));
//        logout.click();

        // webDriver.quit();
    }
}
