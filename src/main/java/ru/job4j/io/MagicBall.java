package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {

    public static void main(String[] args) {
        System.out.println("Задай свой вопрос и получи ответ!");
        Scanner scan = new Scanner(System.in);
        String questions = scan.nextLine();

        int answer = new Random().nextInt(3);
        String text = "";
        switch (answer) {
            case 0:
                text = "Да";
                break;
            case 1:
                text = "Нет";
                break;
            case 2:
                text = "Может быть";
                break;
        }
        System.out.println("Мой ответ:" + text);
    }
}
