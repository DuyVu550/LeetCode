package com.example.demo;

public class String_To_Integer {
    public int myAtoi(String s) {
        int number = 0;
        s = s.trim();
        // whitespace
        String t = s;
        t = t.replace("+", " ");
        t = t.replace("-", " ");
        t = t.trim();
        if (!Character.isDigit(t.charAt(0)) && !Character.isDigit(t.charAt(1))) {
            return number;
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (Character.isDigit(c)) {
                number = number * 10 + (c - '0');
            } else {
                if (s.charAt(0) == '-') {
                    number = number * -1;
                }
                return number;
            }
        }
        if (s.charAt(0) == '-') {
            number = number * -1;
        }
        if (number < Math.pow(-2, 31)) {
            number = (int) Math.pow(-2, 31);
        } else if (number > Math.pow(2, 31) - 1) {
            number = (int) Math.pow(2, 31) - 1;
        }
        return number;
    }
}
