package com.example.demo;

import java.util.ArrayList;
import java.util.List;

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

    public static void FindDeepFriend(String owner, int deep, List<Friend> friendList,
            List<DeepFriend> deepFriendList) {
        if (deepFriendList.isEmpty()) {
            deepFriendList.add(new DeepFriend(owner, deep, true));
            deep++;
        }

        for (var i = 0; i < friendList.size(); i++) {
            var friendFrom = friendList.get(i).getFrom();
            var friendTo = friendList.get(i).getTo();
            if (friendFrom.equals(owner) || friendTo.equals(owner)) {
                if (friendFrom.equals(owner)) {
                    deepFriendList = addDeepFriendList(friendTo, deep, deepFriendList);
                } else {
                    deepFriendList = addDeepFriendList(friendFrom, deep, deepFriendList);
                }
            }

        }
        for (var i = 0; i < deepFriendList.size(); i++) {
            if (!deepFriendList.get(i).getVisited()) {
                deepFriendList.get(i).setVisited(true);
                FindDeepFriend(deepFriendList.get(i).getFriend(), deepFriendList.get(i).getDeep() + 1, friendList,
                        deepFriendList);
            }
        }
    }

    public int MaxDeepFriend(List<DeepFriend> deepFriendList) {
        var maxDeep = 0;
        for (DeepFriend df : deepFriendList) {
            var deep = df.getDeep();
            if (maxDeep < deep) {
                maxDeep = deep;
            }
        }
        return maxDeep;
    }

    public static List<DeepFriend> addDeepFriendList(String owner, int deep, List<DeepFriend> deepFriendList) {
        var checkExist = false;
        for (DeepFriend df : deepFriendList) {
            if (owner.equals(df.getFriend())) {
                df.setVisited(true);
                checkExist = true;
            }
        }
        if (!checkExist) {
            deepFriendList.add(new DeepFriend(owner, deep, false));
        }
        return deepFriendList;
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

        List<Friend> friendList = new ArrayList<>();
        for (Friend f : friends) {
            friendList.add(f);
        }
        List<DeepFriend> deepFriendList = new ArrayList<>();
        FindDeepFriend("A", 0, friendList, deepFriendList);
        FriendCalculator alg = new FriendCalculator();
        System.out.println(alg.ListFriend("A", friends));
        System.out.println(alg.MaxDeepFriend(deepFriendList));
    }
}
