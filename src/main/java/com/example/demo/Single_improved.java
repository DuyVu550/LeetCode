package com.example.demo;

public class Single_improved {
    public static void main(String[] args) {
        int[] a = { 2, 1, 2, 54, 56, 55, 54, 56 };
        for (int i = 0; i < a.length; i++) {
            boolean check = true;
            for (int j = 0; j < a.length; j++) {
                if (i == j)
                    continue;
                if (a[i] == a[j]) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(a[i] + " ");
            }
        }
    }
}