package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TextProcessorTest {

    // Тест на простий рядок із підкресленнями
    @Test
    void testBasicUnderscoreNormalization() {
        String input = "___Hello,___world!___";
        String expected = "Hello,_world!";
        String actual = TextProcessor.normalizeUnderscores(input);
        assertEquals(expected, actual, "Strings with underscores should be normalized");
    }

    // Тест на рядок без змін
    @Test
    void testNoUnderscores() {
        String input = "Hello, world!";
        String expected = "Hello, world!";
        String actual = TextProcessor.normalizeUnderscores(input);
        assertEquals(expected, actual.trim(), "String without underscores should remain unchanged");
    }
}