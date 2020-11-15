package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        List<Student> students= new ArrayList<>();

        students.add(new Student ("Jan Kowalski",new Teacher("Sylwia Łuczak-Jagieła")));
        students.add(new Student("Marek Nowak", null));
        students.add(new Student ("Anna Wiśniewska",new Teacher("Anna Krajewska")));
        students.add(new Student("Halina Zalewska", null));
        students.add(new Student("Michał Zamojski", new Teacher("Sylwia Łuczak-Jagieła")));

        for (Student student : students) {
            System.out.println("Uczeń: " + student.getName()
                    + "; Nauczyciel: "
                    + Optional.ofNullable(student.getTeacher()).map(Teacher::getName).orElse("<undefined>"));

        }
    }
}