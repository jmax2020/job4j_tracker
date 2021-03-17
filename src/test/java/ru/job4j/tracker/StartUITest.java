package ru.job4j.tracker;

import org.junit.Test;

import javax.sound.midi.Track;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.hamcrest.core.IsNull.nullValue;

public class StartUITest {
/*
    @Test
    public void whenCreateItem() {
        String[] answers = {"0", "Item1", "1"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        UserAction[] actions = {new CreateAction(), new ExitAction()};
        new StartUI().init(input, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item1"));
    }

    @Test
    public void whenReplaceItem() {
        Item item = new Item();
        item.setName("Item 1");
        Tracker tracker = new Tracker();
        tracker.add(item);
        String[] answers = {"0", "Item 2", String.valueOf(item.getId()), "1"};
        Input input = new StubInput(answers);
        UserAction[] actions = {new ReplaceAction(), new ExitAction()};
        new StartUI().init(input, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item 2"));
    }

    @Test
    public void whenDeleteItem() {
        Item it1 = new Item();
        it1.setName("Item 1");
        Tracker track = new Tracker();
        track.add(it1);
        String[] answ = {"0", String.valueOf(it1.getId()), "1"};
        UserAction[] actions = {new DeleteAction(), new ExitAction()};
        Input inp = new StubInput(answ);
        new StartUI().init(inp, track, actions);
        assertThat(track.findById(it1.getId()), is(nullValue()));
    }
*/
    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindAll() {
        Output out = new StubOutput();
        Input inp = new StubInput( new String[] {"0", "1"});
        Tracker track = new Tracker();
        Item it1 = new Item();
        it1.setName("Item 1");
        track.add(it1);
        UserAction[] act = {new FindAllAction(out), new ExitAction(out)};
        new StartUI(out).init(inp, track, act);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Find all Items" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
                        + "Item(1): " + it1.toString() + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. Find all Items" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
    ));
    }

    @Test
    public void whenFindByID() {
        Output out = new StubOutput();
        Tracker track = new Tracker();
        Item it1 = new Item();
        it1.setName("Item 1");
        track.add(it1);
        Input inp = new StubInput( new String[] {"0", String.valueOf(it1.getId()), "1"});
        UserAction[] act = {new FindItemByIDAction(out), new ExitAction(out)};
        new StartUI(out).init(inp, track, act);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Find Item by id" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
                        + it1.toString() + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. Find Item by id" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
        ));

    }

    @Test
    public void whenFindByName() {
        Output out = new StubOutput();
        Tracker track = new Tracker();
        Item it1 = new Item();
        it1.setName("Item 1");
        track.add(it1);
        Input inp = new StubInput( new String[] {"0", "Item 1", "1"});
        UserAction[] act = {new FindItemByNameAction(out), new ExitAction(out)};
        new StartUI(out).init(inp, track, act);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Find Item by name" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
                        + it1.toString() + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. Find Item by name" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
        ));

    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[] {"11", "0"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {new ExitAction(out)};
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(String.format(
                                        "Menu.%n"
                                      + "0. Exit%n"
                                      + "Wrong input, you can select: 0 - 0%n"
                                      + "Menu.%n"
                                      + "0. Exit%n"

        )));
    }
}