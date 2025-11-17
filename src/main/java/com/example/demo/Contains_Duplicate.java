package com.example.demo;

public class Contains_Duplicate {
    public static void main(String[] args) {
        int[] arr = new int[] { -1, -2, -3, 4, 5, 6, 7, -2 };
        boolean check = Check(arr);
        System.out.print(check);
    }

    public static int Max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int Min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int[] Count(int[] arr) {
        int max = Max(arr);
        int min = Min(arr);
        int[] count = new int[max - min + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }
        return count;
    }

    public static boolean Check(int[] arr) {
        int[] count = Count(arr);
        int min = Min(arr);
        for (int i = 0; i < arr.length; i++) {
            if (count[arr[i] - min] > 1) {
                return true;
            }
        }
        return false;
    }

}
