package com.gtxc.practice.ctci;

/*
    Created by gt at 1:22 PM on Friday, April 01, 2022.
    Project: practice, Package: com.gtxc.practice.
*/

public class Fib {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; ++i) {
            System.out.println(fib(i));
        }
    }

    static int fib(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fib(n-1) + fib(n-2);
    }
}
