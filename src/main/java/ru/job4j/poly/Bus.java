package ru.job4j.poly;

public class Bus implements Transport{

    @Override
    public void drive() {
        System.out.println("Bus driving!");
    }

    @Override
    public void passengers(int numb) {
        System.out.println("Number of passengers is " + numb);
    }

    @Override
    public int refill(int fuel) {
        return fuel;
    }
}
