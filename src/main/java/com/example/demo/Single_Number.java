package com.example.demo;

public class Single_Number {
    public int singleNumber(int[] nums) {
        if (nums.length == 0)
            return 0;
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i];
        }
        return xor;
    }
}
