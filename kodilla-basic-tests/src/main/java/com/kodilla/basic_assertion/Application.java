package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 8;
        int b = 5;
        int addResult = calculator.add(a, b);
        System.out.println("Dodawanie: " +a+ " plus " +b+ " daje wynik " +addResult);
        boolean correctAdd = ResultChecker.assertEquals(13, addResult);
        if (correctAdd) {
            System.out.println("Metoda add działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda add nie działa poprawnie dla liczb " + a + " i " + b);
        }
        int subResult = calculator.sub(a, b);
        System.out.println("Odejmowanie: " +a+ " minus " +b+ " daje wynik " +subResult);
        boolean correctSub = ResultChecker.assertEquals(3, subResult);
        if (correctSub) {
            System.out.println("Metoda sub działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sub nie działa poprawnie dla liczb " + a + " i " + b);
        }
        int expResult = calculator.exp(a);
        System.out.println("Podniesienie do kwadratu liczby " +a+ " daje wynik " +expResult);
        boolean correctExp = ResultChecker.assertEquals(64, expResult);
        if (correctExp) {
            System.out.println("Metoda exp działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda exp nie działa poprawnie dla liczb " + a);
        }
    }
}
