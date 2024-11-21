package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.Test;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class NumberArrayProcessorTest {
    // Тест на масив з різною кількістю цифр
    @Test
    public void testFilterByMaxDigits() {
        NumberArrayProcessor processor = new NumberArrayProcessor();
        int[] input = {1, 123, 4567, 89, 4567};
        int[] expected = {4567, 4567};
        assertArrayEquals("Numbers with the maximum number of digits", expected, processor.filterByMaxDigits(input));
    }

    // Тест на порожній масив
    @Test
    public void testEmptyArray() {
        NumberArrayProcessor processor = new NumberArrayProcessor();
        int[] input = {};
        int[] expected = {};
        assertArrayEquals("An empty input array returns an empty result.", expected, processor.filterByMaxDigits(input));
    }
}