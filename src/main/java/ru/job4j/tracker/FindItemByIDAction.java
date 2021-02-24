package ru.job4j.tracker;

public class FindItemByIDAction implements UserAction{
    private final Output out;

    public FindItemByIDAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find Item by id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Введите искомый Id: ");
        Item item = tracker.findById(id);
        if(item != null) {
            out.println(item.toString());
        } else {
            out.println("Заявка с таким id не найдена!");
        }
        return true;
    }
}
