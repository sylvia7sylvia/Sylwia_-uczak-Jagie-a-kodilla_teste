package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;

public class School {
    private ArrayList<Integer> numberOfStudents = new ArrayList<Integer>();
    private String schoolName;

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void AddClass(int numberOfStudents) {
        this.numberOfStudents.add(numberOfStudents);
    }

    public int SumOfStudents() {
        int totalNumberOfStudents = 0;
        int i;
        for (i = 0; i < numberOfStudents.size(); i++) {
            totalNumberOfStudents = numberOfStudents.stream().mapToInt(Integer::intValue).sum();
        }


        return totalNumberOfStudents;
    }
}
