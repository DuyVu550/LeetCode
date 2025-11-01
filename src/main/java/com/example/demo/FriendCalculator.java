package com.example.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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
        Set<String> blocked = new HashSet<>();
        return getDepth(owner, friends, blocked);
    }

    private int getDepth(String owner, Friend[] friends, Set<String> blocked) {
        int maxDepth = 0;
        // find directed friend
        Set<String> directFriends = new HashSet<>();
        for (Friend f : friends) {
            if (f.getFrom().equals(owner)) {
                directFriends.add(f.getTo());
            }
        }
        // if friend are not directed or blocked, ignoring them
        for (Friend f : friends) {
            if (!f.getFrom().equals(owner) || blocked.contains(f.getTo())) {
                continue;
            }
            // create set to blocked friend
            Set<String> newBlocked = new HashSet<>(blocked);
            newBlocked.addAll(directFriends);
            int depth = 1 + getDepth(f.getTo(), friends, newBlocked);
            if (depth > maxDepth) {
                maxDepth = depth;
            }
        }
        return maxDepth;
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
