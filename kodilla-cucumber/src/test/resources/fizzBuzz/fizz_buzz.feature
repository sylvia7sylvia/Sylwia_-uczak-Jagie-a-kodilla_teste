Feature: Fizz Buzz

  Scenario Outline: The number is divisible by 3, or the number is divisible by 5, or the number is divisible by 3 AND 5, the number is not divisible by 3 or 5.
    Given Number is equal to <number>
    When Check if the number is divisible by 3 and 5
    Then Should get an answer which is: <answer>
    Examples:
      | number | answer |
      | 3 | "Fizz" |
      | 5 | "Buzz" |
      | 15 | "FizzBuzz" |
      | 13 | "None" |