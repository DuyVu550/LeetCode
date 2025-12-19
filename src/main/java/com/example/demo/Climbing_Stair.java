package com.example.demo;

public class Climbing_Stair {
    public int climbStairs(int n) {
        if (n < 1 || n > 45) {
            return 0;
        }
        int num1 = 1;
        int num2 = 1;
        int i = 0;
        while (i < n) {
            int temp = num1;
            num1 = num1 + num2;
            num2 = temp;
            i++;
        }
        return num2;
    }
}
