package ru.job4j.oop;

public class Ball {

    public void tryRun(boolean condition) {
        if (condition == true) {
            System.out.println("Ball eaten");
        } else {
            System.out.println("Ball run away");
        }
    }
}
