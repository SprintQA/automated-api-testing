package com.sprintqa.tests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;


/**
 * @author Tafseer Haider
 * 25 Sep. 2020
 */
public class GetRequest
{
	
	/*
	 * Given the Swagger Petsore API is available
	 * When I send a GET request
	 * Then the status code is 200
	 */
	
	 	
	@Test
	public void get ()
	{
		given().
		
		      baseUri ("https://petstore.swagger.io/v2").
		
		when().
		
		     get ("/pet/1").
		     
		then ().assertThat ().body ("tags[0].name", equalTo("string"));
		
				
	}
	
}
