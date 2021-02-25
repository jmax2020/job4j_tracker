package ru.job4j.ex;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

public class FactTest {

    @Test
    public void when3() {
        int fact = Fact.calc(3);
        assertThat(fact, is(6));
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenMinus5() {
        int fact = Fact.calc(-5);
    }

    @Test
    public void when0() {
        int fact = Fact.calc(0);
        assertThat(fact, is(1));
    }
}