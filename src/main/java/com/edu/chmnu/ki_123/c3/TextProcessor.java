package com.edu.chmnu.ki_123.c3;

public class TextProcessor {
    public static String normalizeUnderscores(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        text = text.strip().replaceAll("^_+|_+$", "");
        return text.replaceAll("_+", "_");
    }
}