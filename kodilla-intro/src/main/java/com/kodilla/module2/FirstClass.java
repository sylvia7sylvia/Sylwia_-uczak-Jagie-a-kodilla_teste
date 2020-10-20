package com.kodilla.module2;

public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 3000, 2020);
        System.out.println("Pierwszy laptop wazy " + notebook.weight + " gram i kosztuje " + notebook.price + "zl");
        notebook.checkWeight();
        notebook.checkYear();
        notebook.checkPrice();
        notebook.checkYearAndPrice();
        System.out.println("   ");

        Notebook heavyNotebook = new Notebook(2100, 1800, 2015);
        System.out.println("Drugi laptop wazy " + heavyNotebook.weight + " gram i kosztuje " + heavyNotebook.price + "zl");
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();
        heavyNotebook.checkPrice();
        heavyNotebook.checkYearAndPrice();
        System.out.println("   ");

        Notebook oldNotebook = new Notebook(1500, 500, 2000);
        System.out.println("Trzeci laptop wazy " + oldNotebook.weight + " gram i kosztuje " + oldNotebook.price + "zl");
        oldNotebook.checkWeight();
        oldNotebook.checkYear();
        oldNotebook.checkPrice();
        oldNotebook.checkYearAndPrice();
        System.out.println("   ");

        Notebook secondNotebook = new Notebook(1000, 1999, 2020);
        System.out.println("Trzeci laptop waży " + secondNotebook.weight + " gram i kosztuje " + secondNotebook.price + "zł");
        secondNotebook.checkWeight();
        secondNotebook.checkYear();
        secondNotebook.checkPrice();
        secondNotebook.checkYearAndPrice();
        System.out.println("   ");

        //wywołujemy zmieną z wagą laptopa, która jest zawarta w innej klasie (klasa com.kodilla.module2.Notebook)

        //można dla każdego notebooka zrobić pętle if/else tak jak poniżej
            /*if (oldNotebook.price < 900) {
                System.out.println("Ten laptop jest tani. Kupuj!");
            } else {
                System.out.println("Ten laptop jest za drogi. Nie kupuj!");
            }*/
        // lub w klasie notebook, stworzyć metodę check.Price() z ta samą pętlą. Nie powtarzmy się wtedy
    }
}