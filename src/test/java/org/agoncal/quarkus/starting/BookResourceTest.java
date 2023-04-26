package org.agoncal.quarkus.starting;

import io.quarkus.test.junit.*;
import jakarta.ws.rs.core.*;
import org.junit.jupiter.api.*;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class BookResourceTest extends NativeBookResourceIT {
    @Test
    public void shouldGetAllBooks() {
        given()
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON).
                when()
                .get("/api/books").
                then()
                .statusCode(Response.Status.OK.getStatusCode())
                .body("size()", is(4));
    }

    @Test
    public void shouldCountAllBooks() {
        given()
                .header(HttpHeaders.ACCEPT, MediaType.TEXT_PLAIN).
                when()
                .get("/api/books/count").
                then()
                .statusCode(Response.Status.OK.getStatusCode())
                .body(is("4"));
    }

    @Test
    public void shouldGetABook() {
        given()
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON)
                .pathParam("id", 1).
                when()
                .get("/api/books/{id}").
                then()
                .statusCode(Response.Status.OK.getStatusCode())
                .body("title", is("Understanding Quarkus"))
                .body("author", is("Antonio"))
                .body("yearOfPublication", is(2020))
                .body("genre", is("IT"));
    }
}
