package ru.job4j.poly;

public class Train implements Vehicle{
    @Override
    public void move() {
        System.out.println("Train driving CHuh-Chuh Chuh-Chuh");
    }

    @Override
    public String usFuel() {
        return "electricity";
    }
}
