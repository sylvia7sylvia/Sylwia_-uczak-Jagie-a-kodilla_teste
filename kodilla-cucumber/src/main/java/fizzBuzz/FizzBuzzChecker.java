package fizzBuzz;

public class FizzBuzzChecker {

    public String fizzBuzzChecker(int number, int numberA, int numberB) {
        if ((number % numberA == 0) && (number % numberB == 0)) {
            return "FizzBuzz";
        }
        else if ((number % numberA == 0) && (number % numberB != 0)) {
            return "Fizz";
        }
        else if ((number % numberA != 0) && (number % numberB == 0)) {
            return "Buzz";
        }
        else return "None";
    }
}
