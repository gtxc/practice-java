package com.gtxc.practice.hackerrank;

/*
    Created by gt at 8:27 PM on Saturday, February 12, 2022.
    Project: practice, Package: com.gtxc.practice.hackerrank.
*/

import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toUpperCase();
        b = b.toUpperCase();

        if (a.length() != b.length()) {
            return false;
        }
        char[] aarr = new char[256];
        char[] barr = new char[256];

        for (int i = 0; i < a.length(); ++i) {
            ++aarr[a.charAt(i)];
            ++barr[b.charAt(i)];
        }

        for (int i = 0; i < 256; ++i) {
            if (aarr[i] != barr[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
