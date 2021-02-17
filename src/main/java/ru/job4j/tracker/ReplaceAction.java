package ru.job4j.tracker;

public class ReplaceAction implements UserAction{
    @Override
    public String name() {
        return "Replace Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Insert name: ");
        int id = input.askInt("Insert id: ");
        Item newItem = new Item(id, name);
        if(tracker.replace(id, newItem)) {
            System.out.println("Well done!");
        } else {
            System.out.println("Mistake!");
        }
        return true;
    }
}
