package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import java.util.HashMap;
import java.util.Map;
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

    public static void duynq(String[] args) {
        int[] a = { 1, 2, 1, 2, 1, 2, 6, 6, 8, 9, 9, -2, 6 };
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], map.get(a[i]) + 1);
        }
        for (int k : map.keySet()) {
            if (map.get(k) == 1) {
                System.out.print(k + " ");
            }
        }
    }
}
