package com.example.demo;

import java.util.HashSet;
import java.util.Set;

public class Single_improved {
    public static void main(String[] args) {
        int[] a = { 1, 2, 1, 2, 1, 2, 6, 6, 8, 9, 9, -2, 6 };
        Set set = new HashSet();
        Set set2 = new HashSet();
        for (int i = 0; i < a.length; i++) {
            if (!set.add(a[i])) {
                set2.add(a[i]);
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (!set2.contains(a[i])) {
                System.out.print(a[i] + " ");
            }
        }
    }
}