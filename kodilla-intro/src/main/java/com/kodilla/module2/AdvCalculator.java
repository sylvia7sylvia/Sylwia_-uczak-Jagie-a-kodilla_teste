package com.kodilla.module2;

public class AdvCalculator {
    public double calculate() {
        String userSelected = UserDialogs.getUserSelection(); // wywołanie klasy getUserSelection z UserDialog
        double a = UserDialogs.getValue();
        double b = UserDialogs.getValue();
        double result = 0;
        switch (userSelected) {
            case "ADD":
                result = a + b;
                break;                     // [1]
            case "SUB":
                result = a - b;
                break;                     // [2]
            case "DIV":
                result = a / b;
                break;                     // [3]
            case "MUL":
                result = a * b;
                break;                     // [4]
        }
        return result;
    }
}