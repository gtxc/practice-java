package com.gtxc.practice.hackerrank;

/*
    Created by gt at 11:54 AM on Tuesday, February 15, 2022.
    Project: practice, Package: com.gtxc.practice.hackerrank.
*/

import java.util.*;

public class DequeUnique {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        Set<Integer> s = new HashSet<>();
        int max = 0;
        long startTime = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            startTime = System.nanoTime();
            deque.addLast(num);
            s.add(num);
            if (deque.size() == m) {
                max = deque.size();
                int removed = deque.removeFirst();
                if (!deque.contains(removed)) {
                    s.remove(removed);
                }
            }
        }
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
        System.out.println(max);

//        s.clear();
//        int maxUnique = 0;
//        long startTime = 0;
//
//        for (int i = 0; i < n; ++i) {
//            int num = in.nextInt();
//            startTime = System.nanoTime();
//            s.add(num);
//            maxUnique = Math.max(s.size(), maxUnique);
//            if (s.size() == m) {
//                break;
//            }
//        }
//        long endTime   = System.nanoTime();
//        long totalTime = endTime - startTime;
//        System.out.println(totalTime);
//        System.out.println(maxUnique);
    }
}
