package com.xyz.bank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage extends BasePage {

    private WebDriver webDriver;

    By logoutBtn = By.xpath("//button[contains(text(), 'Logout')]");
    By homeBtn = By.xpath("//button[contains(text(), 'Home')]");

    public LogoutPage(WebDriver webDriver) {
        super(webDriver);
        this.webDriver = webDriver;
    }

    public void clickOnLogoutBtn() {
        this.webDriver.findElement(logoutBtn).click();
    }

    public void clickOnHomeBtn() {
        this.webDriver.findElement(homeBtn).click();
    }
}
