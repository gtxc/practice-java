package com.gtxc.practice.ctci;

/*
    Created by gt at 12:08 PM on Friday, April 01, 2022.
    Project: practice, Package: com.gtxc.practice.
*/

public class StringPermutation {

    public static void main(String[] args) {
        permutation("abc");
    }

    static void permutation(String str) {
        permutation(str, "");
    }

    static void permutation(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); ++i) {
                String rem = str.substring(0, i) + str.substring(i+1);
                permutation(rem, prefix + str.charAt(i));
            }
        }
    }
}
