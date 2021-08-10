Feature: Login a user
  As a user registered on the platform,
  I want to enter the space advisor website to login

  @ScenarioLoginUser
  Scenario: Login a user
    Given That a user accesses the SpaceAdvisor website in the login page
    When Enter my credentials username Juan, password admin
    Then Validate the login