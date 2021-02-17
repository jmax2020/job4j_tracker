package ru.job4j.tracker;

public class DeleteAction implements UserAction{
    @Override
    public String name() {
        return "Delete Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Insert id: ");
        if(tracker.delete(id)) {
            System.out.println("Well done!");
        } else {
            System.out.println("Can't del Id" + id + "!");
        }
        return true;
    }
}
