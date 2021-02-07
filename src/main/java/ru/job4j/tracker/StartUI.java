package ru.job4j.tracker;

//import java.nio.channels.SelectableChannel;
//import java.sql.SQLOutput;
import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item();
                item.setName(name);
                tracker.add(item);
            } else if(select == 1) {
                Item[] mass = tracker.findAll();
                for(int i = 0; i < mass.length; i++) {
                    System.out.println("Item("+ (i + 1) + "): " + mass[i].toString());
                }
            } else if(select == 2) {
                Scanner scan = new Scanner(System.in);
                System.out.print("Insert id: ");
                int id = Integer.valueOf(scan.nextLine());
                System.out.println("Insert name: ");
                String name = scan.nextLine();
                Item newItem = new Item(id, name);
                if(tracker.replace(id, newItem)) {
                    System.out.println("Well done!");
                } else {
                    System.out.println("Mistake!");
                }
            } else if(select == 3) {
            Scanner delId = new Scanner(System.in);
                System.out.print("Insert Id: ");
                int id = Integer.valueOf(delId.nextLine());
                if(tracker.delete(id)) {
                    System.out.println("Well done!");
                } else {
                    System.out.println("Can't del Id" + id + "!");
                }
            } else if (select == 4) {
                Scanner scan = new Scanner(System.in);
                System.out.print("Введите искомый Id: ");
                int id = Integer.valueOf(scan.nextLine());
                Item item = tracker.findById(id);
                if(item != null) {
                    System.out.println(item.toString());
                } else {
                    System.out.println("Заявка с таким id не найдена!");
                }
            } else if(select ==5) {
                Scanner scan = new Scanner(System.in);
                System.out.print("Insert name");
                Item[] mass = tracker.findByName(scan.nextLine());
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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
