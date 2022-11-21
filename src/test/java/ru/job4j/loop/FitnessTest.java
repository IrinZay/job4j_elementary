package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FitnessTest {

    @Test
    void whenIvanGreatNik() {
        int ivan = 95;
        int nik = 90;
        int expected = 0;
        int rsl = Fitness.calc(ivan, nik);
        assertEquals(expected, rsl);
    }

    @Test
    void whenIvanLessByOneNik() {
        int ivan = 90;
        int nik = 95;
        int expected = 1;
        int rsl = Fitness.calc(ivan, nik);
        assertEquals(expected, rsl);
    }

    @Test
    void whenIvanLessByFewNik() {
        int ivan = 50;
        int nik = 90;
        int expected = 2;
        int rsl = Fitness.calc(ivan, nik);
        assertEquals(expected, rsl);
    }

    @Test
    void whenIvanEqualsNik() {
        int ivan = 90;
        int nik = 90;
        int expected = 1;
        int rsl = Fitness.calc(ivan, nik);
        assertEquals(expected, rsl);
    }
}