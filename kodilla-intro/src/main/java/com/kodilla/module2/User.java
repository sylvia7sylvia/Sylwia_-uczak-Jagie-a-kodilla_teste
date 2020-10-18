package com.kodilla.module2;

public class User {
    String usName;
    int usAge;
    double usHeight;

    public User(String usName, int usAge, double usHeight) {
        this.usName = usName;
        this.usAge = usAge;
        this.usHeight = usHeight;
    }

    public static void main(String[] args) {
        User Sylwia = new User("Sylwia", 38, 1.60);
        User Dawid = new User("Dawid", 36, 1.78);
        User Oktawia = new User("Oktawia", 1, 0.82);
        User Anna = new User("Anna", 38, 1.64);
        User Natalia = new User("Natalia", 34, 1.68);
        User Karolina = new User("Karolina", 37, 1.65);
        User Jan = new User("Jan", 15, 1.50);

        User[] users = {Sylwia, Dawid, Oktawia, Anna, Natalia, Karolina, Jan};

        int tempAge = 0;
        double tempHeight = 0;
        for (int i = 0; i < users.length; i++) {
            tempAge = tempAge + users[i].usAge;
            tempHeight = tempHeight + users[i].usHeight;
        }
        int averageAge = tempAge / users.length;
        double averageHeight = tempHeight / users.length;
        System.out.println("Srednia wieku uzytkowników to " + averageAge);
        System.out.println("Sredni wzrost uzytkowników to " + averageHeight);

        for (int i = 0; i < users.length; i++) {  //przed zmianą - zmiana tego zapisu na inną formę jest w 40 lini
            if (users[i].usAge <= averageAge)
                System.out.println("Uzytkownicy, ktorych wiek jest ponizej sredniej to " + users[i].usName);
        }
        for (User user : users) {   //dlaczego inteliJ tak to zmienił????
            if (user.usHeight > averageHeight)
                System.out.println("Uzytkownicy, wzrost jest powyżej średniej " + user.usName);
        }
    }
}
