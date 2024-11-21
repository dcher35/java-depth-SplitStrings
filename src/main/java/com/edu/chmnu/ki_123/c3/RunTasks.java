package com.edu.chmnu.ki_123.c3;

import java.util.Arrays;

public class RunTasks {
    public static void main(String[] args) {
        TextProcessor textProcessor = new TextProcessor();
        String inputText = "___Hello,___world!___";
        String normalizedText = textProcessor.normalizeUnderscores(inputText);
        System.out.println("1. Normalized text: " + normalizedText);

        System.out.println("\n--------------------");

        NumberArrayProcessor numberProcessor = new NumberArrayProcessor();
        int[] inputNumbers = {1, 123421, 1421, 1412, 13, 132};
        int[] filteredNumbers = numberProcessor.filterByMaxDigits(inputNumbers);
        System.out.println("\n2. Numbers with the maximum number of digits: " + Arrays.toString(filteredNumbers));

        System.out.println("\n--------------------");

        NegativeNumberReplacer numberReplacer = new NegativeNumberReplacer();
        String numberString = "\nString 12 with numbers -1, 2, 5, -4, 12. Replace all negative";
        String replacedString = numberReplacer.replaceNegatives(numberString);
        System.out.println("\n3. String with negative number substitution: " + replacedString);
    }
}