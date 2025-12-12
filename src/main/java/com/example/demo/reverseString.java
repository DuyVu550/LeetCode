package com.example.demo;

public class reverseString {
    public void reverseString(char[] s) {
        int k = 0;
        int n = s.length - 1;
        while (k < n) {
            char temp = s[k];
            s[k] = s[n];
            s[n] = temp;
            k++;
            n--;
        }
    }
}
