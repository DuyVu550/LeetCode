package com.example.demo;

import java.util.HashSet;

public class Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet();
        for (int num : nums) {
            set.add(num);
        }
        return set.size() < nums.length;
    }
}
