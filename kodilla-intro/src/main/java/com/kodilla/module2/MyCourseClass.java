package com.kodilla.module2;

public class MyCourseClass {
    enum KodillaCourse {
        JD,  /* Java Developer */
        JDP, /* Java Developer Plus */
        TA,  /* Tester Automatyzujący */
        TAI  /* Tester Automatyzujący z egzaminem ISTQB */
    }

    public static void main(String[] args) {

        KodillaCourse myCourse = KodillaCourse.TA;

        switch (myCourse) {
            case JD:
                System.out.println("Java Developer");
                break;
            case JDP:
                System.out.println("Java Developer Plus");
                break;
            case TA:
                System.out.println("Tester Automat.");
                break;
            case TAI:
                System.out.println("Tester Automat. z ISTQB");
                break;
        }
    }
}
