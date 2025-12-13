package com.example.demo;

public class palindrome {
    public boolean isPalindrome(String s) {
        String t = solveSpecialSituation(s);
        int left = 0;
        int right = t.length() - 1;
        while (left < right) {
            char c1 = t.charAt(left);
            char c2 = t.charAt(right);
            if (c1 != c2) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public String solveSpecialSituation(String s) {
        String t = "";
        s = s.toLowerCase();
        s = s.replaceAll(" ", "");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                t += c;
            }
        }
        return t;
    }
}
