package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int rsl = FindLoop.indexOf(data, el);
        int expected = 0;
        assertEquals(expected, rsl);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[] {5, 7, 3};
        int el = 10;
        int rsl = FindLoop.indexOf(data, el);
        int expected = -1;
        assertEquals(expected, rsl);
    }
}