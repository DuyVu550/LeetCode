package com.example.demo;

import java.util.ArrayList;

public class FriendCalculator {

    public ArrayList<String> ListFriend(String owner, Friend[] friends) {
        ArrayList<String> list = new ArrayList<>();
        // TODO: Implement the logic to list the friends of the owner
        return list;
    }

    public int MaxDeepFriend(String owner, Friend[] friends) {
        int maxDeep = 0;
        // TODO: Implement the logic to find the maximum depth of the friends of the
        // owner
        return maxDeep;
    }

    public static void main(String[] args) {
        Friend[] friends = {
                new Friend("A", "B", 10),
                new Friend("B", "C", 20),
                new Friend("A", "D", 5),
                new Friend("C", "D", 3),
                new Friend("E", "A", 40),
                new Friend("F", "E", 50),
                new Friend("D", "I", 0),
                new Friend("G", "H", 5),
        };
        FriendCalculator alg = new FriendCalculator();
        System.out.println(alg.ListFriend("A", friends));
        System.out.println(alg.MaxDeepFriend("A", friends));
    }
}
