package com.qa.challenge.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By usernameInput = By.id("userName");
    private By passwordInput = By.id("password");
    private By loginBtn = By.id("login");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://demoqa.com/login");
    }

    public void enterUsername(String name) {
        driver.findElement(usernameInput).sendKeys(name);
    }

    public void enterPassword(String pass) {
        driver.findElement(passwordInput).sendKeys(pass);
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }
}
