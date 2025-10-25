package com.example.demo;

public class Friend {
    private String from;
    private String to;
    private int time;

    public Friend(String from, String to, int time) {
        this.from = from;
        this.to = to;
        this.time = time;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public int getTime() {
        return time;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
