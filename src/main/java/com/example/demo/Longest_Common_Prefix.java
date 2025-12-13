package com.example.demo;

public class Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        String first = strs[0];
        for (int i = 0; i < first.length(); i++) {
            char c = first.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                char c2 = strs[j].charAt(i);
                if (c != c2) {
                    return first.substring(0, i);
                }
            }
        }
        return "";
    }
}
