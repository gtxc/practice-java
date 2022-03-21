package com.gtxc.practice.norma;

/*
    Created by gt at 1:58 AM on Monday, March 07, 2022.
    Project: practice, Package: com.gtxc.practice.norma.
*/

public class Combinatorics {
    public static void main(String[] args) {
        System.out.println(combinations(8));
        System.out.println(combinations(3));
        System.out.println(combinations2(8));
        System.out.println(combinations2(3));
    }

    // first understanding with respect to example in question
    static int combinations(int num) {
        if (num <=2 ) {
            return 1;
        }
        int noOfCombinations = 1;
        for (int i = 2; i < num; ++i) {
            noOfCombinations = noOfCombinations * 2 + 1;
        }
        return noOfCombinations;
    }

    // after submitting question, realized that I was wrong
    // max steps that can take either 1 or 2
    static int combinations2(int num) {
        if (num <= 1) return 1;
        if (num <= 2) return 2;

        class Factorial {
            int find(int n) {
                if (n < 1) return 1;
                return n * find(n - 1);
            }
        }
        Factorial factorial = new Factorial();
        return ((factorial.find(num)/ (2 * factorial.find(num-2))) + num ) / 2;
    }
}
