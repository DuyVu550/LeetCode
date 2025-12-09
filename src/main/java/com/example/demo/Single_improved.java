package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class Single_improved {
    public static void main(String[] args) {
        int[] a = { 1, 2, 1, 2, 1, 2, 6, 6, 8, 9, 9, -2, 6 };
        Map<Integer, Integer> map = new HashMap();
        for (int x : a) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (var x : map.keySet()) {
            if (map.get(x) == 1) {
                System.out.print(x + " ");
            }
        }
    }
}