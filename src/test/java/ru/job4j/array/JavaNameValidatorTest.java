package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaNameValidatorTest {
    @Test
    void whenEmptyNameInvalid() {
        assertFalse(JavaNameValidator.isNameValid(""));
    }

    @Test
    void whenFullLatValid() {
        assertTrue(JavaNameValidator.isNameValid("first"));
    }

    @Test
    void whenFullLatAndSomeUpperCaseLettersValid() {
        assertTrue(JavaNameValidator.isNameValid("fIRST"));
    }

    @Test
    void whenLatNumberValid() {
        assertTrue(JavaNameValidator.isNameValid("first1"));
    }

    @Test
    void whenLatWithSpecialSymbolUnderValid() {
        assertTrue(JavaNameValidator.isNameValid("first_user"));
    }

    @Test
    void whenNumberInValid() {
        assertFalse(JavaNameValidator.isNameValid("123"));
    }

    @Test
    void whenFirstLatinUpperCaseIsInvalid() {
        assertFalse(JavaNameValidator.isNameValid("First"));
    }

    @Test
    void whenLatNumberAndTwoSpecialSymbolsUnderValid() {
        assertTrue(JavaNameValidator.isNameValid("fir$t_u$er_1"));
    }

    @Test
    void whenFirstSpecialSymbolUnderIsValid() {
        assertTrue(JavaNameValidator.isNameValid("_First"));
    }
}