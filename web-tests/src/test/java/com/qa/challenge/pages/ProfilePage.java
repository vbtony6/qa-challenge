package com.qa.challenge.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {

    private WebDriver driver;

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isDisplayed() {
        return driver.findElement(By.xpath("//div[@class='main-header' and text()='Profile']")).isDisplayed();
    }
}
