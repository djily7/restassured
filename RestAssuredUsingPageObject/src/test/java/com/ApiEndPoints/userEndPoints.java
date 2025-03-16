package com.ApiEndPoints;

import com.ApiPayloads.User;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
public class userEndPoints {
	
	public static Response createUser(User payload) {
		Response response =
				given()
				.accept(ContentType.JSON)
				.contentType(ContentType.JSON)
				.body(payload)
				.when()
				.post(Routes.postCall);
				return response;
		
	}
	public static Response getUser(String userName) {
		Response response =
				given()
				.accept(ContentType.JSON)
				.contentType(ContentType.JSON)
				.pathParam("username", userName)
				.when()
				.get(Routes.getCall);
				return response;
	}
	public static Response updatetUser(String userName, User userPlayload) {
		Response response =
				given()
				.accept(ContentType.JSON)
				.contentType(ContentType.JSON)
				.pathParam("username", userName)
				.body(userPlayload)
				.when()
				.put(Routes.putCall);
				return response;
	}
	public static Response deleteUser(String userName) {
		Response response =
				given()
				.accept(ContentType.JSON)	
				.pathParam("username", userName)
				.when()
				.delete(Routes.getCall);
				return response;
	}
	
}

