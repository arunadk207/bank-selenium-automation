package com.xyz.bank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    private WebDriver webDriver;
    public BasePage(WebDriver webDriver) {
        this.webDriver= webDriver;
    }
    public boolean isElementPresent(String text) {
        try {
            System.out.println(text);
            Thread.sleep(5000);
            WebElement webElement = webDriver.findElement(By.xpath(String.format("//*[text()='%s']", text)));
            return webElement.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getCurrentUrl() {
        return this.webDriver.getCurrentUrl();
    }
}
