package com.example.demo;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = { 6, 6, 2, 3, 3, 3, 4, 4, 1, 1, 8, 7, 7, 8, -8 };
        Arrays.sort(arr);
        int k = removeDuplicates(arr); // number of different
        int[] expectedArr = new int[k];
        int j = 0;
        expectedArr[j] = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                j++;
                expectedArr[j] = arr[i + 1];
            }
        }
        System.out.println(k + ", " + Arrays.toString(expectedArr));
    }

    public static int removeDuplicates(int[] arr) {
        int k = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                k++;
            }
        }
        return k + 1;
    }

}
