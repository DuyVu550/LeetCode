package com.example.demo;

public class reverseInteger {
    public int reverse(int x) {
        if (x < Integer.MIN_VALUE || x > Integer.MAX_VALUE) {
            return 0;
        }
        int digit = 0;
        int sign = 1;
        sign = (x < 0) ? -1 : 1;
        x = x * sign;
        while (x > 0) {
            int balance = x % 10;
            // digit * 10 + balance > Integer.MAX_VALUE (wrong direction)
            if (digit > (Integer.MAX_VALUE - balance) / 10) {
                return 0;
            }
            digit = digit * 10 + balance;
            x /= 10;
        }
        return digit * sign;
    }
}
