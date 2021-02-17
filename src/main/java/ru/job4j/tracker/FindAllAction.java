package ru.job4j.tracker;

public class FindAllAction implements UserAction{
    @Override
    public String name() {
        return "Find all Items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] mass = tracker.findAll();
        for(int i = 0; i < mass.length; i++) {
            System.out.println("Item("+ (i + 1) + "): " + mass[i].toString());
        }
        return true;
    }
}
