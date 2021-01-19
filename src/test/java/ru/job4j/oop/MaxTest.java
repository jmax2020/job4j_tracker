package ru.job4j.oop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void max() {
        int a = Max.max(4, 7);
        assertThat(a, is(7));
    }

    @Test
    public void testMax() {
        int b = Max.max(4, 6, 9);
        assertThat(b, is(9));
    }

    @Test
    public void testMax1() {
        int c = Max.max(1, 3, 5, 7);
        assertThat(c, is(7));
    }
}