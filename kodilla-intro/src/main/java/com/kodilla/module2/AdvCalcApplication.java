package com.kodilla.module2;

public class AdvCalcApplication {
    public static void main(String[] args) {
        UserDialogs ud = new UserDialogs(); //zmienna ud do której bedzie przypisana metoda getUserName
        ud.getUserName();                      // z klasy UserDialogs
        AdvCalculator calculator = new AdvCalculator();  //wywołanie klasy AdvCalculator
        double result = calculator.calculate();
        System.out.println("Result: " + result);
    }
}