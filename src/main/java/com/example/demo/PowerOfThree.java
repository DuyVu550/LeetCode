package com.example.demo;

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        if (n == 1) {
            return true;
        }
        return false;
    }
}
