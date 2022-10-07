package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP6K2ThenS2() {
        double p = 6;
        double k = 2;
        double expected = 2;
        double rsl = SqArea.square(p, k);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenP4K1ThenS2() {
        double p = 4;
        double k = 1;
        double expected = 1;
        double rsl = SqArea.square(p, k);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenP8K2ThenS2() {
        double p = 8;
        double k = 2;
        double expected = 3.55;
        double rsl = SqArea.square(p, k);
        Assert.assertEquals(expected, rsl, 0.01);
    }
}