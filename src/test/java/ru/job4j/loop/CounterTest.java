package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    void whenSumNumbersFromOneToTenThenFiftyFive() {
        int start = 0;
        int finish = 10;
        int expected = 55;
        int rsl = Counter.sum(start, finish);
        assertEquals(expected, rsl);
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int expected = 30;
        int rsl = Counter.sumByEven(start, finish);
        assertEquals(expected, rsl);
    }

    @Test
    void whenSumEvenNumbersFromThreeToEightThenEighteen() {
        int start = 3;
        int finish = 8;
        int expected = 18;
        int rsl = Counter.sumByEven(start, finish);
        assertEquals(expected, rsl);
    }
}