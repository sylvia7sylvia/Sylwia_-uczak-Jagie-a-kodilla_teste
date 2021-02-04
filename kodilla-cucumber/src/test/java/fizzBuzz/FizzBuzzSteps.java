package fizzBuzz;

import io.cucumber.java8.En;
import org.junit.Assert;

public class FizzBuzzSteps implements En {
    private int number;
    private String answer;

    public FizzBuzzSteps() {

        Given("Number is equal to 3", () -> {
            this.number = 3;
        });

        Given("Number is equal to 5", () -> {
            this.number = 5;
        });

        Given("Number is equal to 15", () -> {
            this.number = 15;
        });

        Given("Number is equal to 13", () -> {
            this.number = 13;
        });

        When("Check if the number is divisible by 3 and 5", () -> {
            FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();
            this.answer = fizzBuzzChecker.fizzBuzzChecker(this.number);
        });

        Then("Should get an answer which is: {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }
}