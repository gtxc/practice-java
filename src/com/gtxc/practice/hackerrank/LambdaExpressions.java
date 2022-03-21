package com.gtxc.practice.hackerrank;

/*
    Created by gt at 8:16 PM on Sunday, February 20, 2022.
    Project: practice, Package: com.gtxc.practice.hackerrank.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {

    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    // Old one
    // public PerformOperation isOdd() {
    //     PerformOperation p = n -> {
    //         return n % 2 == 1 ? true : false;
    //     };
    //     return p;
    // }

    // public PerformOperation isPrime() {
    //     PerformOperation p = n -> {
    //         if (n == 1) {
    //             return true;
    //         } else {
    //             for (int i = 2; i < Math.sqrt(n); ++i) {
    //                 if (n % i == 0) {
    //                     return false;
    //                 }
    //             }
    //             return true;
    //         }
    //     };
    //     return p;
    // }

    // public PerformOperation isPalindrome() {
    //     PerformOperation p = n -> {
    //         String nStr = Integer.toString(n);
    //         String rStr = "";
    //         for (int i = 0; i < nStr.length(); ++i) {
    //             rStr += nStr.charAt(nStr.length()-1-i);
    //         }
    //         if (nStr.equals(rStr)) {
    //             return true;
    //         }
    //         return false;
    //     };
    //     return p;
    // }

    // new one
    // Write your code here
    public PerformOperation isOdd() {
        return n -> n % 2 == 1;
    }

    public PerformOperation isPrime() {
        return n -> {
            if (n != 1) {
                for (int i = 2; i < Math.sqrt(n); ++i) {
                    if (n % i == 0) {
                        return false;
                    }
                }
            }
            return true;
        };
    }

    public PerformOperation isPalindrome() {
        return n -> {
            String nStr = Integer.toString(n);
            String rStr = "";
            for (int i = 0; i < nStr.length(); ++i) {
                rStr += nStr.charAt(nStr.length()-1-i);
            }
            return nStr.equals(rStr);
        };
    }

}

public class LambdaExpressions {

    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T--> 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}

