Feature: Customer tab check
  Background:
    Given User opens login page
    And Login is "admin"
    And Password is "work4aig"
    And User submit form
    And Page redirected to admin tab
    And User click Adv Search
    And Fill first name "Lynx"
    And Click Search button
    And Customer "Lynx Lynxy" opened

  Scenario Outline:
    When I click link "<linkText>"
    Then "<text>" is on the page
    Examples:
      |linkText|text|
      |myWorkTabOpen|My Work Tasks|
      |customerTabOpen|Customer Information|
      |billingTabOpen|Personal Lines Accounts|
      |policyTabOpen|Policy #|
      |quoteTabOpen|Select Quote|
      |claimTabOpen|Claim #|
      |reportsTabOpen|Activity Reports For Selected Criteria|
      |producerTabOpen|Select Agency|

  Scenario: Table test
    When Open page pageName with text
      |myWorkTabOpen|My Work Tasks|
      |customerTabOpen|Customer Information|
      |billingTabOpen|Personal Lines Accounts|
      |policyTabOpen|Policy #|
      |quoteTabOpen|Select Quote|
      |claimTabOpen|Claim #|
      |reportsTabOpen|Activity Reports For Selected Criteria|
      |producerTabOpen|Select Agency|
