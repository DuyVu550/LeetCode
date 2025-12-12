package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class isAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap();
        // count character in String s
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            map.put(charS, map.getOrDefault(charS, 0) + 1);
        }
        // remove character in map if character in t = s, when character in String t no
        // existed, it falses
        for (int i = 0; i < t.length(); i++) {
            char charT = t.charAt(i);
            map.put(charT, map.getOrDefault(charT, 0) - 1);
            if (map.get(charT) < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abba";
        String t = "bba";
        System.out.println(isAnagram(s, t));
    }
}
