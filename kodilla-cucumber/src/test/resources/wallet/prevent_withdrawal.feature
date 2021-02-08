Feature: Prevent users from taking out more money than their wallet contains
  Scenario Outline: User tries to take out more money than their balance
    Given there is <balance> USD in my wallet
    When I withdraw <withdraw> USD
    Then nothing should be dispensed
    And I should be told that I don't have enough money in my wallet
    Examples:
      | balance | withdraw  |
      | 1 | 2               |
      | 10 | 20             |
      | 20 | 30             |