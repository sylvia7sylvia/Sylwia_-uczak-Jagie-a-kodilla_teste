package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avg1 = UsersRepository.getUsersList()
                .stream()
                .filter(age -> age.getAge() >= 40)
                .map(u -> u.getNumberOfPosts())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(avg1);

        double avg2 = UsersRepository.getUsersList()
                .stream()
                .filter(age -> age.getAge() < 40)
                .map(u -> u.getNumberOfPosts())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(avg2);

    }
}
