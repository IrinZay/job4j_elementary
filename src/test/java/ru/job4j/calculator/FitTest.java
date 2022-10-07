package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

public class FitTest {

    @Test
    public void whenMan180Than92() {
        short height = 180;
        double expected = 92;
        double rsl = Fit.manWeight(height);
        Assert.assertEquals(expected, rsl, 0.01);

    }

    @Test
    public void whenWoman170Than69() {
        short height = 170;
        double expected = 69;
        double rsl = Fit.womanWeight(height);
        Assert.assertEquals(expected, rsl, 0.01);
    }
}