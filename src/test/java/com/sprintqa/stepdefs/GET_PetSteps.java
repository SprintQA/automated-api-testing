package com.sprintqa.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GET_PetSteps
{
	RequestSpecification request;
	Response response;
	
	@Given("the Swagger Petsore API is available")
	public void given ()
	{
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		
		request = RestAssured.given ();
	}

	@When("I send a GET request")
	public void when ()
	{
		response = request.when ().get ("/pet/1");
	}

	@Then("the status code is {int}")
	public void then (int statusCode)
	{
		response.then().statusCode (statusCode);
	}

}
