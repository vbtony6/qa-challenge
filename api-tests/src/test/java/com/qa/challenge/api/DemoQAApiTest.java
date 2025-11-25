package com.qa.challenge.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoQAApiTest {

    @Test
    void testGetBooks() {

        // Base URL de la API
        RestAssured.baseURI = "https://demoqa.com";

        // GET /BookStore/v1/Books
        Response response = RestAssured
                .given()
                .when()
                .get("/BookStore/v1/Books")
                .then()
                .extract()
                .response();

        // Validar status code
        assertEquals(200, response.getStatusCode(),
                "El status debe ser 200");

        // Imprimir respuesta para debugging
        System.out.println("\n📘 Response Body:");
        System.out.println(response.getBody().asString());
    }
}