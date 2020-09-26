package com.sprintqa.tests;



import org.junit.Test;

import model.Category;
import model.Pet;
import model.Status;
import model.Tag;

import static io.restassured.RestAssured.*;

import java.util.Collections;

/**
 * @author Tafseer Haider
 * 26 Sep. 2020
 */
public class PutRequest
{
	/*
	 * Given the Swagger Petsore API is available
	 * When I update an existing pet in the system
	 * Then the status code is 200
	 * And verify that pet is sold
	 */
	
	private static final String IMAGE_URL = "https://placedog.net/800/640?id=31";
	
	Pet pet = Pet.builder ().
			  id(1).
			  category (new Category (1, "animal")).
			  name ("doggie").
			  photourls (Collections.singletonList (IMAGE_URL)).
			  tags (Collections.singletonList (new Tag(1, "woof"))).
	          status (Status.sold).build ();
	
	@Test
	public void put ()
	{
		given().baseUri ("https://petstore.swagger.io/v2").header ("Content-Type", "application/json").
		body(pet).log ().all ().
		
		when().put ("/pet").then ().statusCode (200);
		
	}
	
}
