package com.kodilla.module2;

public class AdvCalcApplication {
    public static void main(String[] args) {
        //UserDialogs getUserName = new UserDialogs();
        AdvCalculator calculator = new AdvCalculator();  //wywołanie klasy AdvCalculator
        double result = calculator.calculate();
        System.out.println("Result: " + result);
    }
}