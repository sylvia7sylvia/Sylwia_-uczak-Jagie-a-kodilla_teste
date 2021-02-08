Feature: Cash Withdrawal

  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited 200 USD in my wallet
    When I request 30 USD
    Then 30 USD should be dispensed
    And the balance of my wallet should be 170 USD

  Scenario: Successful withdrawal of 0$ from a wallet in credit
    Given I have deposited 100 USD in my wallet
    When I request 0 USD
    Then 0 USD should be dispensed

  Scenario: Successful withdrawal of 50$ from a wallet in credit
    Given I have deposited 50 USD in my wallet
    When I request 50 USD
    Then 50 USD should be dispensed