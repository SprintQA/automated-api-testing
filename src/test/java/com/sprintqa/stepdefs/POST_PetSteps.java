package com.sprintqa.stepdefs;

import java.util.Collections;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import model.Category;
import model.Pet;
import model.Status;
import model.Tag;

public class POST_PetSteps
{

	RequestSpecification		request;
	Response					response;
	private static final String	IMAGE_URL	= "https://placedog.net/800/640?id=31";

	Pet							pet			= Pet.builder ().id (1).category (new Category (1, "animal")).name ("doggie")
			.photourls (Collections.singletonList (IMAGE_URL)).tags (Collections.singletonList (new Tag (1, "woof"))).status (Status.placed).build ();

	@Given("the Swagger Petsore API is available for post request")
	public void given ()
	{

		request = RestAssured.given ().baseUri ("https://petstore.swagger.io/v2").header ("Content-Type", "application/json").body (pet).log ().all ();

	}

	@When("I send a POST request")
	public void when ()
	{

		response = request.when ().post ("/pet");
	}

	@Then("the status code is {int} for the post request")
	public void then (int statusCode)
	{
		response.then ().statusCode (statusCode);
	}

}
