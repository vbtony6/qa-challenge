package com.qa.challenge.steps;

import com.qa.challenge.pages.LoginPage;
import com.qa.challenge.pages.ProfilePage;
import com.qa.challenge.utils.TokenReader;

import io.cucumber.java.en.*;
import org.json.JSONObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginSteps {

    private WebDriver driver;
    @SuppressWarnings("unused")
    private LoginPage loginPage;
    private ProfilePage profilePage;

    /* @Given("the browser is open")
    public void the_browser_is_open() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        profilePage = new ProfilePage(driver);
    } */

    /* @Given("the user is already authenticated via API")
    public void the_user_is_authenticated_via_api() throws Exception {

        JSONObject token = TokenReader.readToken();

        driver.get("https://demoqa.com/login");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("localStorage.setItem('userID', arguments[0]);", token.getString("userId"));
        js.executeScript("localStorage.setItem('token', arguments[0]);", token.getString("token"));
        js.executeScript("localStorage.setItem('expires', arguments[0]);", token.getString("expires"));

        driver.navigate().refresh();
    } */

    /* @Then("the profile page should be displayed")
    public void the_profile_page_should_be_displayed() {
        assertTrue(profilePage.isDisplayed());
        driver.quit();
    } */
}
