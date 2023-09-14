package ru.netology.rest;

import io.restassured.specification.Argument;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanTest {


    @Test
    void dateFieldTest() {

         given()
                 .baseUri("https://postman-echo.com")
                 .contentType("text/plain; charset=UTF-8")
                 .body("information") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                 .when()
                 .post("/post")
// Проверки
                 .then()
                 .statusCode(200)
                 .body("data", equalTo("information"))
         ;
     }

}
