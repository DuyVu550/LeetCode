package com.example.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class LeetCodeApplication2 {
    static String logs[] = {
            "A B 10",
            "B C 20",
            "A D 5",
            "C D 3",
            "E A 40",
            "F E 50",
            "D I",
            "G H 5"
    };

    public static void main(String[] args) {
        /*
         * A call B 10s
         * B call C 20s
         * A call D 5s
         * C call D 3s
         * E call A 40s
         * F call E 50s
         * D call I
         * G call H 5s
         */

        String temp = "A";
        Set<String> set = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(temp);
        int count = 0; // cấp độ bạn bè
        // BFS
        while (!queue.isEmpty()) {
            // cấp hiện tại
            count++;
            // lấy kích thước hàng đợi
            for (int i = 0; i < queue.size(); i++) {
                // lấy phần tử đầu tiên
                String current = queue.poll();
                // lấy danh sách gọi trực tiếp
                ArrayList<String> calls = Directly_Call(current);
                // duyệt danh sách gọi trực tiếp
                for (String callee : calls) {
                    // nếu chưa có trong tập hợp thì thêm vào
                    if (!set.contains(callee)) {
                        set.add(callee);
                        queue.add(callee);
                    }
                }
            }
        }
        set.remove(temp);
        System.out.println("Directly_Call(" + temp + ") => " + set.toString());
        System.out.println("MaxDeepFriend(" + temp + ") => " + count);
    }

    public static ArrayList Directly_Call(String temp) {
        ArrayList<String> list = new ArrayList<>();
        for (var d : logs) {
            String[] parts = d.split(" ");
            if (parts[0].equals(temp)) {
                list.add(parts[1]);
            }
            if (parts[1].equals(temp)) {
                list.add(parts[0]);
            }
        }
        return list;
    }
}
