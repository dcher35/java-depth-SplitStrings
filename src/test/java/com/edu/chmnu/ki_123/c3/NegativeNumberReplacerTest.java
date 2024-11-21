package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NegativeNumberReplacerTest {

    // Тест на рядок з від'ємними числами
    @Test
    void testReplaceNegatives() {
        NegativeNumberReplacer replacer = new NegativeNumberReplacer();
        String input = "String 12 with numbers -1, 2, 5, -4, 12. Replace all negative";
        String expected = "String 12 with numbers [], 2, 5, [], 12. Replace all negative";
        String actual = replacer.replaceNegatives(input);
        assertEquals(expected, actual, "Replace negative numbers to []");
    }

    // Тест без від'ємних чисел
    @Test
    void testNoNegatives() {
        NegativeNumberReplacer replacer = new NegativeNumberReplacer();
        String input = "String with positive numbers 1, 2, 3.";
        String expected = "String with positive numbers 1, 2, 3.";
        String actual = replacer.replaceNegatives(input);
        assertEquals(expected, actual, "String unchanged if there are no negative numbers");
    }
}