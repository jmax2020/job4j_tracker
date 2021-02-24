package ru.job4j.tracker;

public class ReplaceAction implements UserAction{
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

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
            out.println("Well done!");
        } else {
            out.println("Mistake!");
        }
        return true;
    }
}
