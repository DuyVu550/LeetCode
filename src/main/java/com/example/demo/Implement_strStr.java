package com.example.demo;

public class Implement_strStr {
    public int strStr(String haystack, String needle) {
        boolean check = true;
        if (haystack.length() < needle.length())
            return -1;
        for (int i = 0; i < haystack.length(); i++) {
            int temp = i;
            check = true;
            if (haystack.charAt(temp) == needle.charAt(0)) {
                for (int j = 1; j < needle.length(); j++) {
                    temp++;
                    if (haystack.charAt(temp) != needle.charAt(j)) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    return i;
                }
            }

        }
        return -1;
    }
}
