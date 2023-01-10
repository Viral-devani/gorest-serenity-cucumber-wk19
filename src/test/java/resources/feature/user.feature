Feature: Testing different request on the gorest application

  Scenario:Check if the gorest application can be accessed by users
    When User send a GET request to users endpoints
    Then User must get list of users and valid status code 200

  Scenario: Create a new user and verify if user is added
    When I create a new user by providing all the information
    Then I verfiy that the new user is created

  Scenario: Update a newly created user information
    When I update a newly created user
    Then I verify new user information is updated

  Scenario: Delete a newly created user
    When I delete a newly created user
    Then I verify user is deleted

