Feature: Display balance

  Scenario Outline: User checks the balance of their wallet
    Given there is <balance> USD in my wallet
    When I check the balance of my wallet
    Then I should see that the balance is <balance> USD
    Examples:
      | balance |
      | 54 |
      | 123 |
      | 111 |
      | 325 |
      | -22 |