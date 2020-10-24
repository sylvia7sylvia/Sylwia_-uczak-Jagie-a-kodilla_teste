package com.kodilla.abstracts.homework;

public class JobApplication {

    public static void main(String[] args) {
        Person person = new Person("Anna", 30, new Teacher(1600, "duża"));
        System.out.println(person.getFirstName() + " pracuje jako " + person.getJob().getClass().getSimpleName());
        System.out.println(person.getFirstName() + " ma " + person.getAge() + " lat");
        System.out.println(person.getFirstName() + " zarabia " +person.getJob().getSalary());
        System.out.println("Jej odpowiedzialność w pracy jest " +person.getJob().getResponsibilities());

    }

}
