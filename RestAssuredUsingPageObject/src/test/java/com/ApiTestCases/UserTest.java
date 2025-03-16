package com.ApiTestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.ApiEndPoints.userEndPoints;
import com.ApiPayloads.User;
import com.github.javafaker.Faker;
import io.restassured.response.Response;

public class UserTest {
	
	Faker faker;
	User userPlayload;
	
	@BeforeClass
	public void generateTestData() {
		faker = new Faker();   //provide memory
		userPlayload = new User();   // providing memory
		userPlayload.setId(faker.idNumber().hashCode()); // generate fake id
		userPlayload.setUsername(faker.name().username());
		userPlayload.setFirstName(faker.name().firstName());
		userPlayload.setFirstName(faker.name().lastName());
		userPlayload.setEmail(faker.internet().safeEmailAddress());
		userPlayload.setPassword(faker.internet().password(5,10));
		userPlayload.setPhone(faker.phoneNumber().cellPhone());
			
	}
	@Test(priority =1)
	public void testCreateUser() {
		Response response = userEndPoints.createUser(userPlayload);
		response.then().log().all();
		// validation using assertions
		Assert.assertEquals(response.getStatusCode(), 200);
		System.out.println("this is our create user method");
		
		
	}
	@Test(priority =2)
	public void testgetUser() {
		Response response = userEndPoints.getUser(this.userPlayload.getUsername());
		response.then().log().all();
		// validation using assertions
		Assert.assertEquals(response.getStatusCode(), 200);
		System.out.println("this is our get user method");
	}
	@Test(priority =3)
	public void testUpdateUser() { //updatetUser(this.userPlayload.getUsername(),userPlayload);
		userPlayload.setFirstName(faker.name().firstName());
		Response response = userEndPoints.updatetUser(this.userPlayload.getUsername(), userPlayload);
		response.then().log().all();
		// validation using assertions
		Assert.assertEquals(response.getStatusCode(), 200);
		System.out.println("this is our update user method");
	}
	
	@Test(priority =4)
	public void testDeleteUser() {
		Response response = userEndPoints.deleteUser(this.userPlayload.getUsername());
		response.then().log().all();
		// validation using assertions
		Assert.assertEquals(response.getStatusCode(), 200);
		System.out.println("this is our Delete user method");
	}
}

