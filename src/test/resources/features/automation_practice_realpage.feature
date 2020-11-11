#languaje:en

Feature: User can add multiple items to cart

  @ScenarioOne
  Scenario: User can add women blouse
    Given The user is on Homepage
    Then the user clicks Women
    And user clicks Tops
    And User Clicks blouses
    And user clicks on add to cart
    Given the user clicks on continue shopping
    Then the user is returned to the homepage

