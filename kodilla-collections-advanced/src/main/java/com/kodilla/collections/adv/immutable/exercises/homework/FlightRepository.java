package com.kodilla.collections.adv.immutable.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    static List<Flight> getFlightsTable() {

        List<Flight> flightsList = new ArrayList<>();

        flightsList.add(new Flight("Gdańsk", "Warszawa"));
        flightsList.add(new Flight("Warszawa", "Gdańsk"));
        flightsList.add(new Flight("Gdańsk", "Londyn"));
        flightsList.add(new Flight("Gdańsk", "Wrocław"));
        flightsList.add(new Flight("Londyn", "Edynburg"));

        return flightsList;
    }
}
