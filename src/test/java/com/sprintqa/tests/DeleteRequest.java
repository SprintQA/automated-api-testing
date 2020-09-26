package com.sprintqa.tests;

import static io.restassured.RestAssured.*;

import org.junit.Test;
/**
 * @author Tafseer Haider
 * 26 Sep. 2020
 */
public class DeleteRequest
{
	
	/*
	 * Given the Swagger Petsore API is available
	 * When I delete an existing pet in the system
	 * Then the status code is 200
	 */
	
	@Test
	public void delete ()
	{
		given().baseUri ("https://petstore.swagger.io/v2").header ("api-key", "special-key").
				
		when().delete ("/pet/1").then ().statusCode (200);
	}

}
