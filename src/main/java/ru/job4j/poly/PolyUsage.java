package ru.job4j.poly;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle train = new Train();
        Vehicle car = new Car();
        Vehicle[] mass = new Vehicle[] {plane, train, car};
        for (Vehicle a : mass) {
            a.move();
            System.out.println(a.getClass().getSimpleName() + " using " + a.usFuel());
        }
    }
}


