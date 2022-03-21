package com.gtxc.practice.hackerrank;

/*
    Created by gt at 8:56 PM on Saturday, February 12, 2022.
    Project: practice, Package: com.gtxc.practice.hackerrank.
*/

public class StringTokens {

    public static void main(String[] args) {

        String s = "!!He_  is _a !very very. _ good@ boy, isn't he?";
        String[] sarr = s.trim().split("[\\W_]+");

        int emptyStr = 0;

        for (String ss : sarr) {
            if (ss.isEmpty()) {
                ++emptyStr;
            }
        }

        System.out.println(sarr.length - emptyStr);

        for (String ss : sarr) {
            if (!ss.isEmpty()) {
                System.out.println(ss);
            }
        }
    }
}
