package com.kodilla.spring.basic.spring_dependency_injection.homework;


import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private Display display;

    public Calculator (Display display) {
        this.display = display;
    }

    public double addition (double a, double b) {
        double add = a + b;
        display.display(add);
        return add;
    }

    public double subtract (double a, double b) {
        double sub = a - b;
        display.display(sub);
        return sub;
    }

    public double multiply (double a, double b) {
        double mul = a * b;
        display.display(mul);
        return mul;
    }

    public double divide(double a, double b) throws ZeroUsageException {
        if(a == 0 || b == 0) {
            throw new ZeroUsageException();
        } else {
            double div = a / b;
            display.display(div);
            return div;
        }
    }
}
