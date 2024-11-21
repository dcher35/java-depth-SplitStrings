package com.edu.chmnu.ki_123.c3;

import java.util.ArrayList;
import java.util.List;

public class NumberArrayProcessor {
    public int[] filterByMaxDigits(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return new int[0];
        }

        int maxDigits = 0;
        for (int number : numbers) {
            maxDigits = Math.max(maxDigits, countDigits(number));
        }

        List<Integer> result = new ArrayList<>();
        for (int number : numbers) {
            if (countDigits(number) == maxDigits) {
                result.add(number);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    private int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }
}