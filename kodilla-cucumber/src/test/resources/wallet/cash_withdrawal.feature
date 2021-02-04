Feature: Cash Withdrawal

  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed
    And the balance of my wallet should be $170

  Scenario: Successful withdrawal of 0$ from a wallet in credit
    Given I have deposited $100 in my wallet
    When I request $0
    Then $0 should be dispensed

  Scenario: Successful withdrawal of 50$ from a wallet in credit
    Given I have deposited $50 in my wallet
    When I request $50
    Then $50 should be dispensed