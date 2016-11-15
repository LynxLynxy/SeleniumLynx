Feature: User logs to system
Background:
Given User opens login page

  Scenario: User logs with not valid credentionals
    When Login is "Incorrect"
    And Password is "Incorrect"
    And User submit form
    And Error "Wrong password or user name" display

  Scenario: User logs with valid credentionals
    When Login is "admin"
    And Password is "work4aig"
    And User submit form
    And Page redirected to admin tab

  Scenario: User log out
    When Login is "admin"
    And Password is "work4aig"
    And User submit form
    And User click log out