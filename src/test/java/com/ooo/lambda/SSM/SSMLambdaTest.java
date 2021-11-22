package com.ooo.lambda.SSM;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

@QuarkusTest
//@QuarkusTestResource(SsmResource.class)
class SSMLambdaTest {

  @Test
  public void testHandleRequest() {

    given()
        .contentType("application/json")
        .accept("application/json")
        .when()
        .post("/_lambda_")
        .then()
        .statusCode(200)
        .body ("body", equalTo("Bill"));

  }
}