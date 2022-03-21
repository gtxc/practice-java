package com.gtxc.practice.hackerrank;

/*
    Created by gt at 7:33 PM on Saturday, February 12, 2022.
    Project: practice, Package: com.gtxc.practice.hackerrank.
*/

import java.util.Scanner;

public class SubstringComparison {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        smallest = new String(new char[k]).replace("\0", "z");
        for (int i = 0; i < s.length() - k + 1; ++i) {
            String ssub = s.substring(i, i + k);
            if (smallest.compareTo(ssub) > 0) {
                smallest = ssub;
            }
            if (largest.compareTo(ssub) < 0) {
                largest = ssub;
            }
        }

        return smallest + "\n" + largest;
    }
}
