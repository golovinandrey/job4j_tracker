package ru.job4j.oop;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

public class PointTest {

    @Test
    public void testDistance() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double result = a.distance(b);
        double expected = 2.0;
        assertThat(result, closeTo(expected, 0.1));
    }

    @Test
    public void testDistance1() {
        Point a = new Point(1, 1);
        Point b = new Point(1, 1);
        double result = a.distance(b);
        double expected = 0.0;
        assertThat(result, closeTo(expected, 0.1));
    }
}