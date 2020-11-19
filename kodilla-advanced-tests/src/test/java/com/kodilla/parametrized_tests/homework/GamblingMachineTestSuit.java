package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class GamblingMachineTestSuit {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachine.csv", numLinesToSkip = 1)
    public void shouldGenerateComputerNumbers(int one, int two, int three, int four, int five, int six) throws InvalidNumbersException {
        Set<Integer> integers = new HashSet<>();
        integers.add(one);
        integers.add(two);
        integers.add(three);
        integers.add(four);
        integers.add(five);
        integers.add(six);
        int w = gamblingMachine.howManyWins(integers);
        assertTrue(w >= 0 && w <= 6);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachine2.csv", numLinesToSkip = 1)
    public void shouldThrowException(String input) {
        Set<Integer> inputSet = Stream.of(input.split("-"))
                .map(Integer::valueOf)
                .collect(Collectors.toCollection(HashSet::new));
        assertThrows(InvalidNumbersException.class, ()
                -> gamblingMachine.howManyWins(inputSet), "Wrong numbers provided");

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachine3.csv")
    public void shouldThrowExeptionIfDontHaveNumber(String s1) {
        Arrays.asList(s1.split(",")).forEach(s ->
                assertThrows(NumberFormatException.class, () -> Integer.parseInt(s)));

//  ostatni test w przypadku testow białoskrzynkowych nie ma sensu,
//  bo znając kod i zastosowanie w nim funkcji
//  RandomNumber nigdy nie wylosujemy liter zamiast liczb.
//  Gdybyśmy kodu nie znali to taki test ma sens.

    }
}