package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public Job getJob() {
        return job;
    }

    public void printResponsibilities() {
        System.out.println(this.job.getResponsibilities());
    }
}
