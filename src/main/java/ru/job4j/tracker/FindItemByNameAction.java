package ru.job4j.tracker;

public class FindItemByNameAction implements UserAction{
    private final Output out;

    public FindItemByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find Item by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] mass = tracker.findByName(input.askStr("Insert name: "));
        if(mass.length > 0) {
            for(int i =0; i < mass.length; i++) {
                out.println(mass[i].toString());
            }
        } else {
            out.println("Заявки с таким именем не найдены!");
        }
        return true;
    }
}
