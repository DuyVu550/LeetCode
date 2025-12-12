package com.example.demo;

public class reverseInteger {
    public int reverse(int x) {
        int temp = x;
        // change negative number to positive number
        if (temp < 0)
            temp *= -1;
        int digit = 0;
        while (temp > 0) {
            int balance = temp % 10;
            digit = digit * 10 + balance;
            temp /= 10;
        }
        // if negative number, reverseNumber * -1
        if (x < 0) {
            digit *= -1;
        }
        return digit;
    }
}
