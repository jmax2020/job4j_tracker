package ru.job4j.tracker;

import javax.swing.*;

public class StartUI {

    public static void createItem(Tracker tracker, Input input) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item();
        item.setName(name);
        tracker.add(item);
    }

    public static void replaceItem(Tracker tracker, Input inp) {
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

    public static void deteleItem(Tracker tracker, Input inp) {
        int id = inp.askInt("Insert Id: ");
        if(tracker.delete(id)) {
            System.out.println("Well done!");
        } else {
            System.out.println("Can't del Id" + id + "!");
        }
    }

    public static void findItemById(Tracker tracker, Input inp) {
        int id = inp.askInt("Введите искомый Id: ");
        Item item = tracker.findById(id);
        if(item != null) {
            System.out.println(item.toString());
        } else {
            System.out.println("Заявка с таким id не найдена!");
        }
    }

    public static void findItemByName(Tracker tracker, Input inp) {
        Item[] mass = tracker.findByName(inp.askStr("Insert name"));
        if(mass.length > 0) {
            for(int i =0; i < mass.length; i++) {
                System.out.println(mass[i].toString());
            }
        } else {
            System.out.println("Заявки с таким именем не найдены!");
        }
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: " + System.lineSeparator());
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for(int i = 0; i < actions.length; i++) {
            System.out.println(i + ". " + actions[i].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {new CreateAction(), new FindAllAction(), new ReplaceAction(), new DeleteAction(), new FindItemByIDAction(), new FindItemByNameAction(), new ExitAction()};
        new StartUI().init(input, tracker, actions);
    }
}
