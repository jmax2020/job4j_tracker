package ru.job4j.poly;

public class Plane implements Vehicle{
    @Override
    public void move() {
        System.out.println("Plane flying");
    }

    @Override
    public String usFuel() {
        return "aviation fuel";
    }
}
