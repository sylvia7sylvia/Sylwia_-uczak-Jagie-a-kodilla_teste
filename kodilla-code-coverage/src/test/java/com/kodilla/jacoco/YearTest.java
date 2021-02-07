package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class YearTest {

    @Test
    void shouldBeLeapYearIfDivisibleBy4and100and400() {

        //given
        Year year = new Year(1600);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }

    @Test
    void shouldNotBeLeapYearIfItIsNotDivisibleBy4and100and400() {

        //given
        Year year = new Year(1111);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(!isLeapYear);
    }

    @Test
    void shouldNotBeLeapYearIfDivisibleBy4and100() {

        //given
        Year year = new Year(1500);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(!isLeapYear);
    }

    @Test
    void shouldBeLeapYearIfDivisibleBy4only() {

        //given
        Year year = new Year(1528);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }
}