package com.example.demo;

import java.util.ArrayList;

public class FriendCalculator {

    public ArrayList<String> ListFriend(String owner, Friend[] friends) {
        ArrayList<String> list = new ArrayList<>();
        // TODO: Implement the logic to list the friends of the owner
        list.add(owner); // Start from the owner
        // Expand the list by exploring all connections
        for (int i = 0; i < list.size(); i++) {
            String current = list.get(i); // Get the current friend
            // Check all friends to find connections
            for (Friend f : friends) {
                if (f.getFrom().equals(current) && !list.contains(f.getTo())) {
                    list.add(f.getTo());
                } else if (f.getTo().equals(current) && !list.contains(f.getFrom())) {
                    list.add(f.getFrom());
                }
            }
        }
        list.remove(owner);
        return list;
    }

    public int MaxDeepFriend(String owner, Friend[] friends) {
        int maxDeep = 0;
        // TODO: Implement the logic to find the maximum depth of the friends of the
        // owner
        for (Friend f : friends) {
            if (f.getFrom().equals(owner)) {
                int depth = 1 + MaxDeepFriend(f.getTo(), friends);
                if (depth > maxDeep) {
                    maxDeep = depth;
                }
            }
        }
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
        // A [B, D, E] [C, I, F]
        // => list Friend of A: [B, D, E, C, I, F]
        // => max deep friend of A: 2
        FriendCalculator alg = new FriendCalculator();
        System.out.println(alg.ListFriend("A", friends));
        System.out.println(alg.MaxDeepFriend("A", friends));
    }
}
