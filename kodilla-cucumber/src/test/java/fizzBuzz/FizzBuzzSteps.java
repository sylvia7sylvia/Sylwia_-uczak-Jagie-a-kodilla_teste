package fizzBuzz;

import io.cucumber.java8.En;
import org.junit.Assert;

public class FizzBuzzSteps implements En {
    private int number;
    private String answer;

    public FizzBuzzSteps() {

        Given("^Number is equal to (.*)$", (String number) -> this.number = Integer.parseInt(number)); //TODO: pls take a look at this solution

        When("^Check if the number is divisible by (.*) and (.*)$", (String numberA, String numberB) -> {
            FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();
            this.answer = fizzBuzzChecker.fizzBuzzChecker(this.number, Integer.parseInt(numberA), Integer.parseInt(numberB));
        });

        Then("Should get an answer which is: {string}", (String string) -> Assert.assertEquals(string, this.answer));
    }
}