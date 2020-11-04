package com.kodilla.collections.adv.maps;

import java.util.HashMap;
import java.util.Map;

public class BasicMapExample {
    public static void main(String[] args) {
        Map<String, Double> grades =  new HashMap<>();
        grades.put("Matematyka", 4.5);
        grades.put("Fizyka", 5.0);
        grades.put("Chemia", 6.0);

        Double grade = grades.get("Matematyka");
        System.out.println(grade);

        for (Map.Entry<String, Double> note : grades.entrySet()) {
            System.out.println("Ocena z " + note.getKey() + " jest równa " + note.getValue());
        }
    }
}
