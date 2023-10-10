package com.xyz.bank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.math.BigDecimal;

public class AccountPage extends BasePage {

    By welcomeTitle = By.xpath("//*[text()=' Welcome ']/span");
    By accountNumber = By.xpath("//*[text()='Account Number : ']/strong[1]");
    By accountBalance = By.xpath("//*[text()='Account Number : ']/strong[2]");
    By depositBtn = By.xpath("//button[contains(text(), 'Deposit')]");

    By withdrwlBtn = By.xpath("//button[contains(text(), 'Withdrawl')]");
    By transactionBtn = By.xpath("//button[contains(text(), 'Transactions')]");

    By depositAmountElement = By.xpath("//input[@type='number']");

    By depositSubmitBtn = By.xpath("//button[@type='submit']");

    private WebDriver webDriver;

    public AccountPage(WebDriver webDriver) {
        super(webDriver);
        this.webDriver = webDriver;
    }


    public String getWelcomeTitle() {
        WebElement titleElement = webDriver.findElement(welcomeTitle);
        assert titleElement.isDisplayed();
        String title = titleElement.getText();
        System.out.println("Title " + title);
        return title;
    }

    public String getAccountNumber() {
        WebElement accountNumberElement = webDriver.findElement(accountNumber);
        String accountNumber = accountNumberElement.getText();
        return accountNumber;
    }

    public String getAccountBalance() {
        WebElement balanceElement = webDriver.findElement(accountBalance);
        assert balanceElement.isDisplayed();
        String balance = balanceElement.getText();
        return balance;
    }

    public void selectDepositOption() {
        WebElement depositWebElementBtn = webDriver.findElement(depositBtn);
        assert depositWebElementBtn.isDisplayed();
        depositWebElementBtn.click();
    }

    public void enterAmount(BigDecimal amount) {
        WebElement depositAmount = webDriver.findElement(depositAmountElement);
        depositAmount.clear();
        depositAmount.sendKeys(amount.toString());
    }

    public void clickOnDepositBtn() {
        WebElement depositButton = webDriver.findElement(depositBtn);
        depositButton.click();
    }

    public boolean isDepositButtonDisplayed() {
        WebElement depositButton = webDriver.findElement(depositSubmitBtn);
        return depositButton.isDisplayed();
    }

    public void clickOnDepositSubmitButton() {
        WebElement depositButton = webDriver.findElement(depositSubmitBtn);
        depositButton.click();
    }

    public void clickOnWithdrawSubmitButton() {
        WebElement depositButton = webDriver.findElement(depositSubmitBtn);
        depositButton.click();
    }

    public boolean isWithdrawlButtonDisplayed() {
        WebElement depositButton = webDriver.findElement(withdrwlBtn);
        return depositButton.isDisplayed();
    }

    public void clickOnWithdrawlButton() {
        WebElement depositButton = webDriver.findElement(withdrwlBtn);
        depositButton.click();
    }

    public void clickOnTransactionButton() {
        WebElement depositButton = webDriver.findElement(transactionBtn);
        depositButton.click();
    }




}
