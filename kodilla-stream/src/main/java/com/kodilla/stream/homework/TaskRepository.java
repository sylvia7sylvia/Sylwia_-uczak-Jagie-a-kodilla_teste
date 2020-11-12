package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks(){
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Przygotować listę zadań na pierwszy sprint", LocalDate.of(2020, Month.JANUARY, 10), LocalDate.of(2020, Month.JANUARY, 15)));
        tasks.add(new Task("Zapoznać się z dokumentacją", LocalDate.of(2020, Month.JANUARY, 15), LocalDate.of(2020, Month.APRIL, 10)));
        tasks.add(new Task("Napisać testy", LocalDate.of(2010, Month.FEBRUARY, 21), LocalDate.of(2020, Month.MAY, 28)));
        tasks.add(new Task("Przygotować listę zadań na drugi sprint", LocalDate.of(2020, Month.MAY, 28), LocalDate.of(2020, Month.JUNE, 14)));
        tasks.add(new Task("Przetestować aplikację", LocalDate.of(2020, Month.JUNE, 15), LocalDate.of(2021, Month.SEPTEMBER, 17)));
        tasks.add(new Task("Napisać raport", LocalDate.of(2010, Month.SEPTEMBER, 1), LocalDate.of(2021, Month.OCTOBER, 28)));
        return tasks;
    }
}
