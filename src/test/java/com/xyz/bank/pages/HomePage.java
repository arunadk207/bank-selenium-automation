package com.xyz.bank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private By customerLoginBtn = By.xpath("//*[text()='Customer Login']");
    private By managerLoginBtn = By.xpath("//*[text()='Bank Manager Login']");
    private WebDriver webDriver;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
        this.webDriver = webDriver;
    }

    public void launchApplicationByUrl(String url) {
        this.webDriver.get(url);
    }

    public void clickOnCustomerLoginBtn() {
        this.webDriver.findElement(this.customerLoginBtn).click();
    }

    public void clickOnBankManagerLoginBtn() {
        this.webDriver.findElement(this.managerLoginBtn).click();
    }
}
