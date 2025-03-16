package com.RestAssuredDay2;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

public class differentWaysToCreateRequestBody {
	
	@Test
	public void testPostUsingHashMap(){
		HashMap data = new HashMap();
		data.put("name", "Djily");
		data.put("job", "SDET");
		given()
		.contentType("application/json")
		.body(data)
		.post("https://reqres.in/api/users")
		.then()
		.statusCode(201)
		.log().all();
		System.out.println("This is post method with hash map");
	}
	// create request body using org.json library
	@Test
	public void testPostUsingJsonLib() {
		JSONObject data = new JSONObject();
		data.put("name", "Cynthia");
		data.put("job", "SM");
		given()
		.contentType("application/json")
		.body(data.toString())
		.when()
		.post("https://reqres.in/api/users")
		.then()
		.statusCode(201)
		.log().all();
		System.out.println("This is post method with JSON Lib map");
		
	}
	//create request body using org.json library
	@Test
	public void testPostUsingPojoClass() {
		
		PojoPostRequest data = new PojoPostRequest();
		data.setName("rokiba");
		data.setJob("BA");
		given()
		.contentType("application/json")
		.body(data)
		.when()
		.post("https://reqres.in/api/users")
		.then()
		.statusCode(201)
		.log().all();
		System.out.println("This is post method with Pojo class ");
		}
	
	//create request body using org.json file
		@Test
		public void testPostUsingExternaljsonfile() throws FileNotFoundException {
			//first we need to open the file
			File f = new File("src/test/java/com/RestAssuredDay2/Body.json");
			FileReader fr = new FileReader(f);
			JSONTokener jt = new JSONTokener(fr);
			JSONObject data = new JSONObject(jt);
			given()
			.contentType("application/json")
			.body(data)
			.when()
			.post("https://reqres.in/api/users")
			.then()
			.statusCode(201)
			.log().all();
			System.out.println("This is post method with Pojo class ");
			}
	
		}


