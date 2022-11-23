package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortSelectedTest {
    @Test
    public void whenSortArrayWithFiveElements() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayWithTreeElements() {
        int[] data = new int[]{7, 3, 12};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{3, 7, 12};
        assertArrayEquals(expected, result);
    }
}