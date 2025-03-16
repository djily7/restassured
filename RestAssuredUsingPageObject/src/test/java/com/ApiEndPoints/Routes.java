package com.ApiEndPoints;

public class Routes {
	

	// pet swagger user module here we are going to store only url nothing else in this class
	//https://petstore.swagger.io/v2/user
	//get user:  https://petstore.swagger.io/v2/user/{username}
	// update user: https://petstore.swagger.io/v2/user/{username}
	//delete user: https://petstore.swagger.io/v2/user/{username}
	
	public static String baseUrl ="https://petstore.swagger.io/v2";  // Common part
	public static String postCall = baseUrl+"/user/";
	public static String getCall = baseUrl+"/user/{username}";
	public static String putCall = baseUrl+"/user/{username}";
	public static String deleteCall = baseUrl+"/user/{username}";

}
