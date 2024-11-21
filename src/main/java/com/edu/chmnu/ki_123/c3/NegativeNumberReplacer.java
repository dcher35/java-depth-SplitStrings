package com.edu.chmnu.ki_123.c3;

public class NegativeNumberReplacer {
    public String replaceNegatives(String input) {
        if (input == null) {
            return null;
        }
        return input.replaceAll("-\\d+", "[]");
    }
}