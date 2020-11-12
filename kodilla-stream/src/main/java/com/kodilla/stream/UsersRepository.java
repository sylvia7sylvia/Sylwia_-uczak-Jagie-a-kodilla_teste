package com.kodilla.stream;

import java.util.ArrayList;
import java.util.List;

public class UsersRepository {
    public static List<User> getUsersList() {
        List<User> users = new ArrayList<>();
        users.add(new User("Sylwia Luczak", 38, 303, "Chemik"));
        users.add(new User("Dawid Jagiela", 36, 100, "Informatyk"));
        users.add(new User("Anna Krajewska", 38, 54, "Biolog"));
        users.add(new User("Oktawia Jagiela", 1, 0, "Bobas"));
        users.add(new User("Karolina Kucharczyk", 37, 12, "Asystent"));
        users.add(new User("Dorota Uber", 34, 3, "Chemik"));

        return users;



    }
}
