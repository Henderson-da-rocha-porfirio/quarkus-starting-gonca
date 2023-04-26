package org.agoncal.quarkus.starting;

import io.quarkus.test.junit.*;
import jakarta.ws.rs.core.*;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusIntegrationTest
public class NativeBookResourceIT {

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
                .body("genre", is("Information Technology"));
    }

}