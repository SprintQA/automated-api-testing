package com.sprintqa.tests;

import static io.restassured.RestAssured.*;
import java.util.Collections;

import org.junit.Test;

import model.Category;
import model.Pet;
import model.Status;
import model.Tag;

/**
 * @author Tafseer Haider
 * 26 Sep. 2020
 */
public class PostRequest
{
	
	/*
	 * Given the Swagger Petsore API is available
	 * When I add a new pet to the system
	 * Then the status code is 200
	 */
	private static final String IMAGE_URL = "https://placedog.net/800/640?id=31";
	
	Pet pet = Pet.builder ().
			  id(1).
			  category (new Category (1, "animal")).
			  name ("doggie").
			  photourls (Collections.singletonList (IMAGE_URL)).
			  tags (Collections.singletonList (new Tag(1, "woof"))).
	          status (Status.placed).build ();
			  
	@Test
	public void post ()
	{
		given().
		       baseUri ("https://petstore.swagger.io/v2").
		       header ("Content-Type", "application/json").
		       body(pet).log ().all ().
		       
		when().
		      post ("/pet").
		
		then().
		      statusCode (200);
	}

}
