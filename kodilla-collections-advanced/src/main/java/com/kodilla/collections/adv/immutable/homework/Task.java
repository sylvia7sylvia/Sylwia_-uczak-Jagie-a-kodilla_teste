package com.kodilla.collections.adv.immutable.homework;

public class Task {
    private String title;
    private int duration;

    public Task(String title, int duration) {
        this.title = title;
        this.duration = duration;

        System.out.println(title + ", duration time: " + duration);
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

}
