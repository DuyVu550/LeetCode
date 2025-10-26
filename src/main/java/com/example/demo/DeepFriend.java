package com.example.demo;

public class DeepFriend {
    private String friend;
    private int deep;
    private boolean visited;

    public DeepFriend(String friend, int deep, boolean visited) {
        this.friend = friend;
        this.deep = deep;
        this.visited = visited;
    }

    public String getFriend() {
        return friend;
    }

    public int getDeep() {
        return deep;
    }

    public void setFriend(String friend) {
        this.friend = friend;
    }

    public void setDeep(int deep) {
        this.deep = deep;
    }

    public boolean getVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

}
