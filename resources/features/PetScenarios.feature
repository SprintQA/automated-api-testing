Feature: Pet Scenarios
  This feature includes scenarios that tests the pet Restful services

  @Pet
  Scenario: Users are able to retrieve pet's information
    Given the Swagger Petsore API is available
    When I send a GET request
    Then the status code is 200

   @Pet
   Scenario: Users are able to add a new pet
    Given the Swagger Petsore API is available for post request
    When I send a POST request
    Then the status code is 200 for the post request