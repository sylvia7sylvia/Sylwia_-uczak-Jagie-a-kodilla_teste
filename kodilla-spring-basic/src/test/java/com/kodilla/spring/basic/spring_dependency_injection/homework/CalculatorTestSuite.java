package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
    Calculator bean = context.getBean(Calculator.class);

    @Test
    public void shouldReturnResultOfSummation() {
        Double summation = bean.addition(2.35, 4.89);
        Assertions.assertEquals(7.24, summation, 0.01);
    }

    @Test
    public void shouldReturnResultOfSubtraction() {
        Double subtraction = bean.subtract(2.35, 4.89);
        Assertions.assertEquals(-2.54, subtraction, 0.01);
    }

    @Test
    public void shouldReturnResultOfMultiplication() {
        Double multiplication = bean.multiply(2.35, 4.89);
        Assertions.assertEquals(11.4915, multiplication, 0.01);
    }

    @Test
    public void shouldReturnResultOfDivision() throws ZeroUsageException {
        Double division = bean.divide(11.0, 2.0);
        Assertions.assertEquals(5.5, division, 0.01);
    }

    @Test
    public void shouldReturnExceptionWhenDividingByZero() {
        Assertions.assertThrows(ZeroUsageException.class, () -> {
            Double division = bean.divide(11.0, 0); });
    }
}