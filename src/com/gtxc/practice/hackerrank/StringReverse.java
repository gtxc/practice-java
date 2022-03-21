package com.gtxc.practice.hackerrank;

/*
    Created by gt at 8:02 PM on Saturday, February 12, 2022.
    Project: practice, Package: com.gtxc.practice.hackerrank.
*/

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder Arev = new StringBuilder();
        for (int i = 0; i < A.length(); ++i) {
            Arev.insert(0, A.charAt(i));
        }
        System.out.println(A.compareTo(Arev.toString()) == 0 ? "Yes" : "No");
    }
}
