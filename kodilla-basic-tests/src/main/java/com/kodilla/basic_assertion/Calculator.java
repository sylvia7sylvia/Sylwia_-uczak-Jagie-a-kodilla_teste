package com.kodilla.basic_assertion;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int exp(int a, int n) {    //potęgowanie
        int potega = (int)Math.pow(a, n);
        return potega;
    }
}
