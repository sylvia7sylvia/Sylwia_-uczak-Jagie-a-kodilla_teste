package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShippingCenterTestSuite {

    @Autowired
    ShippingCenter shippingCenter;

    @Test
    public void shouldReturnSuccessMessage() {
        String a = "Package delivered to: Malbork";
        assertTrue(a.equals(shippingCenter.sendPackage("Malbork", 20)));
    }

    @Test
    public void shouldReturnFalseMessage() {
        String a = "Package not delivered to: Malbork";
        assertTrue(a.equals(shippingCenter.sendPackage("Malbork", 60)));
    }
}