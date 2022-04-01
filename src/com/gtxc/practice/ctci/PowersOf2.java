package com.gtxc.practice.ctci;

/*
    Created by gt at 2:30 PM on Friday, April 01, 2022.
    Project: practice, Package: com.gtxc.practice.ctci.
*/

public class PowersOf2 {

    public static void main(String[] args) {
        powersOf2(4);
        powersOf3(27);
    }

    static void powersOf2(int n) {
        for (int i = 0; Math.pow(2,i) <= n; ++i) {
            System.out.println(i + ": " + Math.pow(2,i));
        }
    }

    static int powersOf3(int n) {
        if (n < 1) {
            return 0;
        } else if (n == 1) {
            System.out.println(1);
            return 1;
        } else {
            int prev = powersOf3(n / 3);
            int curr = prev * 3;
            System.out.println(curr);
            return curr;
        }
    }
}
