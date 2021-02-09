package ru.job4j.tracker;

//import java.nio.channels.SelectableChannel;
//import java.sql.SQLOutput;
//import java.util.Scanner;


public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name = input.askStr("Enter name: ");
                Item item = new Item();
                item.setName(name);
                tracker.add(item);
            } else if(select == 1) {
                Item[] mass = tracker.findAll();
                for(int i = 0; i < mass.length; i++) {
                    System.out.println("Item("+ (i + 1) + "): " + mass[i].toString());
                }
            } else if(select == 2) {
                Input inp = new ConsoleInput() ;
                int id = inp.askInt("Insert id: ");
                String name = inp.askStr("Insert name: ");
                Item newItem = new Item(id, name);
                if(tracker.replace(id, newItem)) {
                    System.out.println("Well done!");
                } else {
                    System.out.println("Mistake!");
                }
            } else if(select == 3) {
            ConsoleInput inp = new ConsoleInput();
                int id = inp.askInt("Insert Id: ");
                if(tracker.delete(id)) {
                    System.out.println("Well done!");
                } else {
                    System.out.println("Can't del Id" + id + "!");
                }
            } else if (select == 4) {
                ConsoleInput inp = new ConsoleInput();
                int id = inp.askInt("Введите искомый Id: ");
                Item item = tracker.findById(id);
                if(item != null) {
                    System.out.println(item.toString());
                } else {
                    System.out.println("Заявка с таким id не найдена!");
                }
            } else if(select ==5) {
                ConsoleInput inp = new ConsoleInput();
                Item[] mass = tracker.findByName(inp.askStr("Insert name"));
                if(mass.length > 0) {
                    for(int i =0; i < mass.length; i++) {
                        System.out.println(mass[i].toString());
                    }
                } else {
                    System.out.println("Заявки с таким именем не найдены!");
                }
            } else if(select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu." + System.lineSeparator() +
        "0. Add new Item" + System.lineSeparator() +
        "1. Show all items" + System.lineSeparator()+
        "2. Edit item" + System.lineSeparator() +
        "3. Delete item" + System.lineSeparator() +
        "4. Find item by Id" + System.lineSeparator() +
        "5. Find items by name" + System.lineSeparator() +
        "6. Exit Program" + System.lineSeparator() +
        "Select:");
    }

    public static void main(String[] args) {
        ConsoleInput inp = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(inp, tracker);
    }
}
