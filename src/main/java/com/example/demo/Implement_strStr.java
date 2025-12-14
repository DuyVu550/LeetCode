package com.example.demo;

public class Implement_strStr {
    public static int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length())
            return -1;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int temp = i;
                boolean check = true;
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

    public static void main(String[] args) {
        System.out.println(strStr("sdsadsa", "sad"));
    }
}
