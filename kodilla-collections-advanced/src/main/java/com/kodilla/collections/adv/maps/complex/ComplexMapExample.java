package com.kodilla.collections.adv.maps.complex;

import java.util.HashMap;
import java.util.Map;

public class ComplexMapExample {
    public static void main(String[] args) {
        Map<Student, Grades> school = new HashMap<>();
        Student jan = new Student("Jan", "Kowalski");
        Student adam = new Student("Adam", "Nowak");
        Student ewa = new Student("Ewa", "Wisniewska");

        Grades janGrades = new Grades(5.0, 4.0, 3.0, 2.0);
        Grades adamGrades = new Grades(2.0, 2.5, 2.5, 3.0, 3.5);
        Grades ewaGrades = new Grades(6.0, 5.5, 5.0, 5.5, 4.5, 3.5);

        school.put(jan, janGrades);
        school.put(adam, adamGrades);
        school.put(ewa, ewaGrades);

        System.out.println(school.get(jan));

        for (Map.Entry<Student, Grades> studentGradesEntry : school.entrySet())
            System.out.println(studentGradesEntry.getKey().getFirstname() + ", średnia ocen: "
                    + studentGradesEntry.getValue().getAverage());


    }
}
