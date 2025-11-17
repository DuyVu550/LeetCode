package com.example.demo;

import java.util.Arrays;

public class Rotate_Array {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        int k = 3;
        int[] a = Arrays.copyOfRange(arr, arr.length - k, arr.length);
        int[] b = Arrays.copyOfRange(arr, 0, arr.length - k);
        int[] merged = new int[a.length + b.length];
        System.arraycopy(a, 0, merged, 0, a.length);
        System.arraycopy(b, 0, merged, a.length, b.length);
        System.out.println(Arrays.toString(merged));
    }
}
