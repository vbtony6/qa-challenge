package com.qa.challenge.steps;

import com.qa.challenge.pages.LoginPage;
import com.qa.challenge.pages.ProfilePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.*;

public class DemoQASteps {

    private WebDriver driver;
    private LoginPage loginPage;
    private ProfilePage profilePage;

    @Given("the user is on the DemoQA login page")
    public void the_user_is_on_the_demoqa_login_page() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--headless=new");
        options.addArguments("--user-agent=Mozilla/5.0");
        options.addArguments("--disable-blink-features=AutomationControlled");

        driver = new ChromeDriver(options);
        driver.get("https://demoqa.com/login");

        loginPage = new LoginPage(driver);
        profilePage = new ProfilePage(driver);

        assertEquals("DEMOQA", driver.getTitle());
    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        loginPage.enterUsername("jalazo");
        loginPage.enterPassword("Ayesa2025**!!");
    }

    @When("clicks the login button")
    public void clicks_the_login_button() {
        loginPage.clickLogin();
    }

    @Then("the user should see the profile page")
    public void the_user_should_see_the_profile_page() {
        assertTrue(profilePage.isDisplayed());
        driver.quit();
    }
}






