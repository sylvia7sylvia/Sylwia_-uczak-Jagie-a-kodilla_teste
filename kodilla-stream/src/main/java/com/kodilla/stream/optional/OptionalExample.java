package com.kodilla.stream.optional;

import com.kodilla.stream.User;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User user = new User("User1", 30, 30, "Test");

        Optional<User> optionalUser = Optional.ofNullable(user);
    }
}
