package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00To20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void when35To86Then5dot09() {
        int x1 = 3;
        int y1 = 5;
        int x2 = 8;
        int y2 = 6;
        double expected = 5.09;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void when24To00Then4dot47() {
        int x1 = 2;
        int y1 = 4;
        int x2 = 0;
        int y2 = 0;
        double expected = 4.47;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl, 0.01);
    }
}