package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        String[] answers = {"ho ho ho"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        Item item = new Item();
        item.setName(input.askStr("What?"));
        tracker.add(item);
        Item expected = new Item(22, "ho ho ho");
        assertThat(tracker.findAll()[0].getName(), is(expected.getName()));
    }
}