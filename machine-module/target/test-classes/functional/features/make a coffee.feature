Feature: Make a coffee Functionality
  In order to test if our Coffee Machine model is functional
  I want to verify that the Coffee Machine is functional

  Scenario: Functional while plugged in
    Given a Coffee Machine
    When I plug in the Coffee Machine
    Then the Coffee Machine should be plugged in

  Scenario: Make Espresso in a Cup with Espresso Coffee Machine
    Given an Espresso Coffee Machine
    And the Espresso Coffee Machine is plugged in
    And the Water Tank of the Espresso Coffee Machine has enough Water
    And the Bean Tank of the Espresso Coffee Machine has enough Beans
    And I put a Cup
    When I make an Espresso
    Then I should have a Cup of Espresso

  Scenario: Make Coffee in a Mug with Coffee Machine
    Given a Coffee Machine
    And the Coffee Machine is plugged in
    And the Water Tank of the Coffee Machine has enough Water
    And the Bean Tank of the Coffee Machine has enough Beans
    And I put a Mug
    When I make a Coffee
    Then I should have a Mug of Coffee