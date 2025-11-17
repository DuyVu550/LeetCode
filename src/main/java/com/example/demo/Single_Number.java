package com.example.demo;

public class Single_Number {
    public static void main(String[] args) {
        int[] nums = new int[] { -1, -1, 2, 2, 3, 3, -4, 5, 5 };
        int[] count = count(nums);
        int min = Min(nums);
        for (int i = 0; i < nums.length; i++) {
            if (count[nums[i] - min] == 1) {
                System.out.print(nums[i] + " ");
            }
        }
    }

    public static int Max(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }

    public static int Min(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        return min;
    }

    public static int[] count(int[] nums) {
        int max = Max(nums);
        int min = Min(nums);
        int[] counts = new int[max - min + 1];
        for (int i = 0; i < nums.length; i++) {
            counts[nums[i] - min]++;
        }
        return counts;
    }

}
