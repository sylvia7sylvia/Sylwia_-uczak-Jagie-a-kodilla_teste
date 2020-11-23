package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTestSuite {

    // @ParameterizedTest
    // Aby jej użyć, musimy wykorzystać adnotację @MethodSource: zamiast samej nazwy metody podajemy nazwaKlasy#nazwaMetody
    // @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#BMI")
    // nazwa metody:
    // public void shouldCalculateBMI(String expected, String BMI){
    // Wtedy wystarczy tylko kropkę przed nazwą metody zamienić na znak #
    // assertEquals (expected, BMI);

    @ParameterizedTest
    @MethodSource(value = "providePeopleDataForTestBMI")
    public void shouldReturnProperMessageAccordingToBMI(double heightInMeters, double weightInKilograms, String expectedMessage) {
        Person person = new Person(heightInMeters, weightInKilograms);
        assertEquals(expectedMessage, person.getBMI());

    }

    private static Stream<Arguments> providePeopleDataForTestBMI() {
        return Stream.of(
                Arguments.of(1.80, 40, "Very severely underweight"),
                Arguments.of(1.70, 45, "Severely underweight"),
                Arguments.of(1.75, 52, "Underweight"),
                Arguments.of(1.76, 61, "Normal (healthy weight)"),
                Arguments.of(1.79, 84, "Overweight"),
                Arguments.of(1.77, 95, "Obese Class I (Moderately obese)"),
                Arguments.of(1.83, 118, "Obese Class II (Severely obese)"),
                Arguments.of(1.82, 134, "Obese Class III (Very severely obese)"),
                Arguments.of(1.68, 130, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.69, 148, "Obese Class V (Super Obese)"),
                Arguments.of(1.70, 180, "Obese Class VI (Hyper Obese)")
        );
    }

}