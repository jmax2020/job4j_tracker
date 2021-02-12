package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.hamcrest.core.IsNull.nullValue;

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

    @Test
    public void whenReplaceItem() {
        Item item = new Item();
        item.setName("Item 1");
        Tracker tracker = new Tracker();
        tracker.add(item);
        String[] answers = {String.valueOf(item.getId()), "Item 2"};
        Input input = new StubInput(answers);
        StartUI.replaceItem(tracker, input);
        Item expected = new Item();
        expected.setName("Item 2");
        assertThat(tracker.findById(item.getId()).getName(), is(expected.getName()));
    }

    @Test
    public void whenDeleteItem() {
        Item it1 = new Item();
        it1.setName("Item 1");
        Tracker track = new Tracker();
        track.add(it1);
        int id1 = it1.getId();
        String[] answ = {String.valueOf(id1)};
        Input inp = new StubInput(answ);
        StartUI.deteleItem(track, inp);
        assertThat(track.findById(id1), is(nullValue()));
    }
}