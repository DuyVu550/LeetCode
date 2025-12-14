package com.example.demo;

public class Rotate_Array {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        int k = 7;
        if (k < 0 || k > arr.length)
            return;
        Rotate(arr, 0, arr.length - 1);
        Rotate(arr, 0, k - 1);
        Rotate(arr, k, arr.length - 1);
    }

    public static void Rotate(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
