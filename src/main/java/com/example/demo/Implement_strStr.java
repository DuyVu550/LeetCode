package com.example.demo;

public class Implement_strStr {
    public static int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length())
            return -1;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.substring(i, needle.length() + i).equals(needle)) {
                    return i;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("badsad", "sad"));
    }
}
