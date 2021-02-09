package ru.job4j.tracker;

public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item();
        item.setName(name);
        tracker.add(item);
    }

    public static void replaceItem(Tracker tracker) {
        Input inp = new ConsoleInput() ;
        int id = inp.askInt("Insert id: ");
        String name = inp.askStr("Insert name: ");
        Item newItem = new Item(id, name);
        if(tracker.replace(id, newItem)) {
            System.out.println("Well done!");
        } else {
            System.out.println("Mistake!");
        }
    }

    public static void findAllItem(Tracker tracker) {
        Item[] mass = tracker.findAll();
        for(int i = 0; i < mass.length; i++) {
            System.out.println("Item("+ (i + 1) + "): " + mass[i].toString());
        }
    }

    public static void deteleItem(Tracker tracker) {
        ConsoleInput inp = new ConsoleInput();
        int id = inp.askInt("Insert Id: ");
        if(tracker.delete(id)) {
            System.out.println("Well done!");
        } else {
            System.out.println("Can't del Id" + id + "!");
        }
    }

    public static void findItemById(Tracker tracker) {
        ConsoleInput inp = new ConsoleInput();
        int id = inp.askInt("Введите искомый Id: ");
        Item item = tracker.findById(id);
        if(item != null) {
            System.out.println(item.toString());
        } else {
            System.out.println("Заявка с таким id не найдена!");
        }
    }

    public static void findItemByName(Tracker tracker) {
        ConsoleInput inp = new ConsoleInput();
        Item[] mass = tracker.findByName(inp.askStr("Insert name"));
        if(mass.length > 0) {
            for(int i =0; i < mass.length; i++) {
                System.out.println(mass[i].toString());
            }
        } else {
            System.out.println("Заявки с таким именем не найдены!");
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if(select == 1) {
                StartUI.findAllItem(tracker);
            } else if(select == 2) {
                StartUI.replaceItem(tracker);
            } else if(select == 3) {
                StartUI.deteleItem(tracker);
            } else if (select == 4) {
                StartUI.findItemById(tracker);
            } else if(select ==5) {
                StartUI.findItemByName(tracker);
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
