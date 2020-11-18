package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {

    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"Sylwia", "sylwia7", "syLwiA._-", "5y1wiA.LuCzAk"})
    public void shouldValidateUsername(String userName) {
        boolean result = userValidator.validateUsername(userName);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Sylwi@aa", "    ", "$ylwi@", "~//syl"})
    public void shouldNotValidateUsername(String userName) {
        boolean result = userValidator.validateUsername(userName);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Sylwia@gmail.com", "sylwia7@gmail.com", "syLwiA._-@gmail.com", "5y1wiA.LuCzAk@gmail.com", "5y1wiA.LuCzAk@wp.pl"})
    public void shouldValidateEmails(String email) {
        boolean result = userValidator.validateEmail(email);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Sylwi@aa@ggg.com", " ", "&%%%%$%^.com", "sylwia"})
    public void shouldNotValidateEmails(String email) {
        boolean result = userValidator.validateEmail(email);
        assertFalse(result);
    }
}