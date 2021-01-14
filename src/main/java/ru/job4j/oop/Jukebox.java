package ru.job4j.oop;

public class Jukebox {

    public void music(int position) {
        if(position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox numb1 = new Jukebox();
        numb1.music(1);
        numb1.music(2);
        numb1.music(124);
    }
}
