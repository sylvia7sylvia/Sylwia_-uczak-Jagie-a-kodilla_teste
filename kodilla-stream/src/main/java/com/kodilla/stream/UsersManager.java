package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> username = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getGroup().equals("Chemik"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        System.out.println(username);

        UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getGroup().equals("Chemik"))
                .map(UsersManager::getUserName)
                .forEach(un -> System.out.println(un));

        UsersRepository.getUsersList()
                .stream()
                .map(a -> a.getAge())
                .forEach(ag -> System.out.println(ag));
    }

    public static String getUserName (User user){
        return user.getUsername();
    }
}
