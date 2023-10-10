package com.xyz.bank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CustomerLoginPage extends BasePage {

    private By selectUserName = By.name("userSelect");

    private By loginBtn = By.xpath("//*[text()='Login']");

    private By homeBtn = By.xpath("//*[text()='Home']");

    private WebDriver webDriver;

    public CustomerLoginPage(WebDriver webDriver) {
        super(webDriver);
        this.webDriver = webDriver;
    }

    public void selectUserName() {
        Select select = new Select(webDriver.findElement(selectUserName));
        select.selectByIndex(1);
    }

    public void clickOnLoginBtn() {
        WebElement login = webDriver.findElement(loginBtn);
        login.click();
    }

    public void clickOnHomeBtn() {
        WebElement login = webDriver.findElement(homeBtn);
        login.click();
    }
}
