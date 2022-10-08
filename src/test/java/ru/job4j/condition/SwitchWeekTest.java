package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SwitchWeekTest {

    @Test
    void whenDayIs1() {
        int day = 1;
        String expected = "Понедельник";
        String rsl = SwitchWeek.nameOfDay(day);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenDayIs2() {
        int day = 2;
        String expected = "Вторник";
        String rsl = SwitchWeek.nameOfDay(day);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenDayIs3() {
        int day = 3;
        String expected = "Среда";
        String rsl = SwitchWeek.nameOfDay(day);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenDayIs4() {
        int day = 4;
        String expected = "Четверг";
        String rsl = SwitchWeek.nameOfDay(day);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenDayIs5() {
        int day = 5;
        String expected = "Пятница";
        String rsl = SwitchWeek.nameOfDay(day);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenDayIs6() {
        int day = 6;
        String expected = "Суббота";
        String rsl = SwitchWeek.nameOfDay(day);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenDayIs7() {
        int day = 7;
        String expected = "Воскресенье";
        String rsl = SwitchWeek.nameOfDay(day);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenDayIs10() {
        int day = 10;
        String expected = "Ошибка";
        String rsl = SwitchWeek.nameOfDay(day);
        assertThat(rsl).isEqualTo(expected);
    }
}