package com.kodilla.collections.adv.immutable.homework;

public class Task {
    private final String title;
    private final int duration;

    Task task = new Task("Write 2 new posts", 20);

    public Task(String title, int duration) {
        this.title = title;
        this.duration = duration;

        System.out.println(task.getTitle() + ", duration time: " + task.getDuration());
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

}
