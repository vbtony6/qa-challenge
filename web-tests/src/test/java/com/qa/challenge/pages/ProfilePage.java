package com.qa.challenge.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {

    private WebDriver driver;

    private By profileHeader = By.xpath("//div[@class='main-header' and text()='Profile']");

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isDisplayed() {
        return driver.findElement(profileHeader).isDisplayed();
    }
}
