package com.qa.challenge.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.*;

public class DemoQASteps {

    private WebDriver driver;
    private String token;

    @Given("the browser is open")
    public void the_browser_is_open() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");
        driver = new ChromeDriver(options);
        
        driver.manage().window().maximize();
    }

    @Given("the user is already authenticated via API")
    public void the_user_is_authenticated_via_api() {
        // Aquí colocas tu llamada REST a demoqa para obtener el token
        // Ejemplo ficticio:
        token = "123-sometoken";

        assertNotNull(token, "Token no obtenido");
    }

    @Then("the profile page should be displayed")
    public void the_profile_page_should_be_displayed() {
        driver.get("https://demoqa.com/profile");

        String title = driver.getTitle();
        assertEquals("DEMOQA", title, "No se abrió el perfil");
        
        driver.quit();
    }
}