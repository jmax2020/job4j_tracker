package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item5 = new Item(5, "five");
        DateTimeFormatter form = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        System.out.println(item5.getCreated().format(form));

        Item item7 = new Item(7, "seven");
        Tracker list = new Tracker();
        list.add(item5);
        list.add(item7);
        int numb = 2;
        Item findIt = list.findById(numb);
        System.out.println("под номером " + numb + " записан: " + findIt.getName());

        Item itemPrint = new Item(77, "Print");
        System.out.println(itemPrint.toString());

    }
}
