package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<Task> deadlines = TaskRepository.getTasks()
                .stream()
                .filter(task -> task.getDeadline().isAfter(LocalDate.now()))
//                .map(task -> task.getDeadline())
                .collect(Collectors.toList());
        deadlines.forEach(System.out::println);  //deadlines.forEach(e -> System.out.println(e));

    }
}
