package com.example.demo;

public class RomanToInteger {
    public int romanToInt(String s) {
        // I 1
        // V 5
        // X 10
        // L 50
        // C 100
        // D 500
        // M 1000
        int num = 0;
        s = s.toUpperCase();
        for (int i = 0; i < s.length(); i++) {
            int temp = romanChar(s.charAt(i));
            if (i + 1 < s.length() && romanChar(s.charAt(i + 1)) > temp) {
                num -= temp;
            } else {
                num += temp;
            }
        }
        return num;
    }

    public int romanChar(char s) {
        switch (s) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return s;
    }
}
