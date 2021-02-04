
Feature: Is it Summer?
   Everybody likes Summer

   Scenario Outline: Today is or isn't Summer
      Given today is the <day>
      When I ask whether it's Summer
      Then I should be told <answer>
      Examples:
         | day | answer |
         | last day of December | "Nope" |
         | first day of August | "Yes! Summer!" |
         | second day of January | "Nope"       |
         | 10th day of February  | "Nope"       |
         | 20th day of June      | "Nope"       |
         | 5th day of May        | "Nope"       |
         | 24th day of September | "Nope"       |
         | first day of August   | "Yes! Summer!" |
         | 21th day of June      | "Yes! Summer!" |
         |23th day of August | "Yes! Summer!" |