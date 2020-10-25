package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int a = 8;
        int b = 5;
        int addResult = calculator.add(a, b);
        assertEquals(13, addResult);
    }
    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int a = 8;
        int b = 5;
        int subResult = calculator.sub(a, b);
        assertEquals(3, subResult);
    }
    @Test
    public void testExp() {    //czy podzielić to na pojedyńcze testy dla kazdego potegowania?
        Calculator calculator = new Calculator();
        int a = 8;
        int n = 3;
        int expResultA = calculator.exp(a, n);
        assertEquals(512, expResultA);
        a = -8;
        int expResultB = calculator.exp(a, n);
        assertEquals(-512, expResultB);
        a = 0;
        int expResultC = calculator.exp(a, n);
        assertEquals(0, expResultC);
    }
}
