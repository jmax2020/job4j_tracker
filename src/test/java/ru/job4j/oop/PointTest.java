package ru.job4j.oop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance3D() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 3, 4);
        double dist3D = a.distance3D(b);
        assertThat(dist3D, is(5.0));
    }
}