package ru.job4j.poly;

public class Car implements Vehicle{

    @Override
    public void move() {
        System.out.println("Car driving R-R-R-R-R");
    }

    @Override
    public String usFuel() {
        return "Petrol";
    }
}
