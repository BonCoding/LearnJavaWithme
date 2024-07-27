package com.simplilearn.mavenproject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.response.ValidatableResponseOptions;

import org.json.JSONObject;
import org.junit.BeforeClass;
import org.testng.annotations.Test;

public class ApiTest {

	@BeforeClass
    public void setUp() {
        // Base URL for all API requests
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

    @Test
    public void testGetRequest() {
        // Send GET request to endpoint /posts/1
        Response response = ((RestAssured) given())
                .when()
                .get("/posts/1");

        // Assert status code and print response body
        response.then().statusCode(200);
        System.out.println("Response Body:");
        System.out.println(response.getBody().asString());
    }

    @Test
    public void testPostRequest() {
        // Create request body
        JSONObject requestBody = new JSONObject();
        requestBody.put("userId", 1);
        requestBody.put("title", "New Post Title");
        requestBody.put("body", "New Post Body");

        // Send POST request to endpoint /posts with JSON body
        Response response = ((RestAssured) given()
                .contentType(ContentType.JSON)
                .body(requestBody.toString(), null))
                .when()
                .post("/posts");

        // Assert status code and print response body
        response.then().statusCode(201);
        System.out.println("Response Body:");
        System.out.println(response.getBody().asString());
    }

	private ValidatableResponseOptions<ValidatableResponse, Response> given() {
		// TODO Auto-generated method stub
		return null;
	}
}
