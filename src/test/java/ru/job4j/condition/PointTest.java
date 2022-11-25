package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00To20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2.0;
        double rsl = a.distance(b);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void when35To86Then5dot09() {
        Point a = new Point(3, 5);
        Point b = new Point(8, 6);
        double expected = 5.09;
        double rsl = a.distance(b);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void when24To00Then4dot47() {
        Point a = new Point(2, 4);
        Point b = new Point(0, 0);
        double expected = 4.47;
        double rsl = a.distance(b);
        Assert.assertEquals(expected, rsl, 0.01);
    }
}