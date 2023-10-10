package com.xyz.bank.pages;

import org.openqa.selenium.WebDriver;

public class BankManagerLoginPage extends BasePage {
    private WebDriver webDriver;

    private HomePage homePage;

    public BankManagerLoginPage(WebDriver webDriver) {
        super(webDriver);
        this.webDriver = webDriver;
        this.homePage = new HomePage(this.webDriver);
    }

    public void launchBankUrl(String url) {
        this.webDriver.get(url);
    }

    public void clickOnManagerLoginBtn() {
        this.homePage.clickOnBankManagerLoginBtn();
    }
}
