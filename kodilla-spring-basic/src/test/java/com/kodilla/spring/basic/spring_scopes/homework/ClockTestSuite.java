package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

@SpringBootTest
class ClockTestSuite {

    public void wait(int i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }

    @Test
    public void shouldCreateDifferentClocks() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        //When
        Clock firstClock = context.getBean(Clock.class);
        LocalTime firstTime = firstClock.processClock();
        wait(1);
        Clock secondClock = context.getBean(Clock.class);
        LocalTime secondTime = firstClock.processClock();
        wait(1);
        Clock thirdClock = context.getBean(Clock.class);
        LocalTime thirdTime = firstClock.processClock();
        //Then
        Assertions.assertNotEquals(firstTime, secondTime);
        Assertions.assertNotEquals(secondTime, thirdTime);
        Assertions.assertNotEquals(firstTime, thirdTime);
    }
}