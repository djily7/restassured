package com.RestAssuredDay1;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import org.testng.annotations.Test;
public class HttpRequests {
	int id;
	@Test(priority=1)
	public void getusers() {
		
		
		given()
		.when()
		.get("https://reqres.in/api/users?page=2") // List of users
		.then()
		.statusCode(200)
		.body("page", equalTo(2))
		.body("total", equalTo(12)) // we can add this if we want will be as assertion
		.log().all();   // print the records on the console
	}
	
	@Test(priority=2)
	public void createUsers() {
		
		// first we need to create a body
		HashMap data = new HashMap();
		data.put("name", "Djily");
		data.put("job", "SDET");
		
		id = given()
				.contentType("application/json") // indicate that the request body format id json
				.body(data)
				.when().post("https://reqres.in/api/users")
				.jsonPath().getInt("id");
				//.then()
				//.statusCode(201)
			//	.log().all();   // print the records on the console
				System.out.println("This is create user method");
				System.out.println("This is id of post call" +id);
		
	}
	@Test(priority=3, dependsOnMethods = ("createUsers"))
	public void updateUsers() {
		
		// first we need to create a body
		HashMap data = new HashMap();
		data.put("name", "Sahar");
		data.put("job", "Sr.SDET");
		
		given()
		.contentType("application/json")
		.body(data)
		.when().put("https://reqres.in/api/users/"+id)
		.then()
		.statusCode(200)
		.log().all();   // print the records on the console
		System.out.println("This is update user method");
	}
	@Test(priority=4)
	public void deleteUsers() {
		
		given()
		.when()
		.delete("https://reqres.in/api/users/"+id) 
		.then()
		.statusCode(204);
		System.out.println("This is update user method");
	}
}
