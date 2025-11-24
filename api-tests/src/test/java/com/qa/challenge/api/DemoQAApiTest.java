package com.qa.challenge.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoQAApiTest {

    @Test
    public void testGetBooks() {
        // Definir base URI
        RestAssured.baseURI = "https://demoqa.com";

        // Realizar GET request a la API de libros
        Response response = RestAssured
                .given()
                .when()
                .get("/BookStore/v1/Books")
                .then()
                .extract()
                .response();

        // Verificar que el status code sea 200 OK
        assertEquals(200, response.getStatusCode(), "El status code debe ser 200");

        // Opcional: imprimir el body de la respuesta
        System.out.println("Response Body: " + response.getBody().asString());
    }
}
