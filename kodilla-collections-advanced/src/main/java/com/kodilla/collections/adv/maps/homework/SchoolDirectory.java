package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> principalSchoolMap = new HashMap<>();
        Principal jan = new Principal("Jan", "Kowalski");
        Principal adam = new Principal("Adam", "Nowak");

        School school01 = new School("XX Liceum Ogolnokształcące");
        school01.AddClass(20);
        school01.AddClass(24);
        school01.AddClass(21);
        School school02 = new School("II Liceum Ogolnoksztalcace");
        school02.AddClass(32);
        school02.AddClass(31);
        school02.AddClass(33);
        school02.AddClass(30);

        principalSchoolMap.put(jan, school01);
        principalSchoolMap.put(adam, school02);

        for (Map.Entry<Principal, School> mapElement : principalSchoolMap.entrySet()) {
            System.out.println(mapElement.getKey().getPrincipalfirstname() + " "
                    + mapElement.getKey().getPrincipallastname() + ", dyrektor "
                    + mapElement.getValue().getSchoolName() + ", w którym uczy się "
                    + mapElement.getValue().SumOfStudents() + " uczniów.");


        }
    }


}

