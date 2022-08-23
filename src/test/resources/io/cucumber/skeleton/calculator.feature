Feature: Calculator

  Scenario: 42 and 4711 is 4753
    Given a calculator just got turned on
    When I add 42 and 4711
    Then the result is 4753


  Scenario: Zero multiplied by 4711 is Zero
    Given a calculator just got turned on
    When I multiply with 4711
    Then the result is 0
