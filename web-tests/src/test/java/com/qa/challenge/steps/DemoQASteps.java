package com.qa.challenge.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class DemoQASteps {

    WebDriver driver;
    WebDriverWait wait;

    @Given("the user is on the DemoQA login page")
    public void the_user_is_on_the_demoqa_login_page() {
        // Configura el driver (asegúrate que el chromedriver está en PATH o usa WebDriverManager)
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        driver.get("https://demoqa.com/login");
    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        // Usamos usuario y contraseña de prueba
        driver.findElement(By.id("userName")).sendKeys("testuser1");
        driver.findElement(By.id("password")).sendKeys("Test@123");
    }

    @When("clicks the login button")
    public void clicks_the_login_button() {
        driver.findElement(By.id("login")).click();
    }

    @Then("the user should see the profile page")
    public void the_user_should_see_the_profile_page() {
        // Esperar a que el perfil se muestre
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userName-value")));
        
        boolean isProfileDisplayed = driver.findElements(By.id("userName-value")).size() > 0;
        assertTrue(isProfileDisplayed, "Profile page is not displayed!");
        
        // Cerrar navegador
        driver.quit();
    }
}