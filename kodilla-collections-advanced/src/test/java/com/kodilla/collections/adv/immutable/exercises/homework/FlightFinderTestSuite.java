package com.kodilla.collections.adv.immutable.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> flightFinderList = flightFinder.findFlightsFrom("Gdańsk");
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Gdańsk", "Warszawa"));
        expectedList.add(new Flight("Gdańsk", "Londyn"));
        expectedList.add(new Flight("Gdańsk", "Wrocław"));
        assertEquals(expectedList, flightFinderList);
        assertEquals(3, flightFinderList.size());

    }

    @Test
    public void findFlightsTo() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> flightFinderList = flightFinder.findFlightsTo("Warszawa");
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Gdańsk", "Warszawa"));
        assertEquals(expectedList, flightFinderList);
        assertEquals(1, flightFinderList.size());


    }
}
