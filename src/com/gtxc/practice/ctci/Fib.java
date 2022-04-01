package com.gtxc.practice.ctci;

/*
    Created by gt at 1:22 PM on Friday, April 01, 2022.
    Project: practice, Package: com.gtxc.practice.
*/

public class Fib {
    public static void main(String[] args) {
        allFib(10);
        allFibWithMemo(10);
    }

    static int fib(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    static void allFib(int n) {
        for (int i = 0; i < n; ++i) {
            System.out.println(i + ": " + fib(i));
        }
    }

    static int fibWithMemo(int n, int[] memo) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        if (memo[n] > 0) return memo[n];

        memo[n] = fibWithMemo(n - 1, memo) + fibWithMemo(n - 2, memo);
        return memo[n];
    }

    static void allFibWithMemo(int n) {
        int[] memo = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            System.out.println(i + ": " + fibWithMemo(i, memo));
        }
    }
}
