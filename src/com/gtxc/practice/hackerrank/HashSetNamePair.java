package com.gtxc.practice.hackerrank;

/*
    Created by gt at 12:43 AM on Tuesday, February 15, 2022.
    Project: practice, Package: com.gtxc.practice.hackerrank.
*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetNamePair {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        //Write your code here

        Set<String> namePair = new HashSet<>();
        for (int i = 0; i < t; ++i) {
            namePair.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(namePair.size());
        }

    }
}
