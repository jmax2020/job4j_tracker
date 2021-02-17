package ru.job4j.tracker;

public class FindItemByNameAction implements UserAction{
    @Override
    public String name() {
        return "Find Item by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] mass = tracker.findByName(input.askStr("Insert name: "));
        if(mass.length > 0) {
            for(int i =0; i < mass.length; i++) {
                System.out.println(mass[i].toString());
            }
        } else {
            System.out.println("Заявки с таким именем не найдены!");
        }
        return true;
    }
}
