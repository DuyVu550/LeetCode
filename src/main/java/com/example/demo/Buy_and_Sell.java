package com.example.demo;

public class Buy_and_Sell {
    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        int maxProfit = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                maxProfit += arr[i + 1] - arr[i];
            }
        }
        System.out.println(maxProfit);
    }
}
