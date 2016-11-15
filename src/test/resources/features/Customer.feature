Feature: Customer main functions
  Background:
    Given User opens login page
    And Login is "admin"
    And Password is "work4aig"
    And User submit form
    And Page redirected to admin tab


  Scenario: User search existed customer
    When User click Adv Search
    And Fill first name "Lynx"
    And Click Search button
    And Customer "Lynx Lynxy" opened

