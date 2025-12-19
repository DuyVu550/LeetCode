package com.example.demo;

public class String_To_Integer {
    public int myAtoi(String s) {
        if (s.length() == 0) {
            return 0;
        }
        s = s.trim();
        int number = 0;
        int i = 0;
        int sign = 1;
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        // Digits
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            // number * 10 + digit > Integer.MAX_VALUE (wrong condition)
            if (number > (Integer.MAX_VALUE - digit) / 10) {
                if (sign == -1) {
                    return Integer.MIN_VALUE;
                }
                return Integer.MAX_VALUE;
            }
            number = number * 10 + digit;
            i++;
        }
        return number * sign;
    }
}
