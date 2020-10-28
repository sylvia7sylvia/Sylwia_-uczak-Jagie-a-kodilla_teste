package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(13, calculator.add(8, 5));
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.sub(8, 5));
    }

    @Test
    public void testExpPositiveNumber() {
        Calculator calculator = new Calculator();
        assertEquals(512, calculator.exp(8, 3));
    }

    @Test
    public void testExpNegativeNumber() {
        Calculator calculator = new Calculator();
        assertEquals(-512, calculator.exp(-8, 3));
    }

    @Test
    public void testExpZeroNumber() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.exp(0, 3));
    }
}
