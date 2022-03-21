package com.gtxc.practice.HT;

/*
    Created by gt at 10:28 PM on Sunday, March 06, 2022.
    Project: practice, Package: com.gtxc.practice.HT.
*/

public class HeadTailProblem {
    public static void main(String[] args) {

        System.out.println(minimumNumberOfFlipsToMakeRight("HTHHTTT"));
        System.out.println(minimumNumberOfFlipsToMakeRight("TTTTH"));
        System.out.println(minimumNumberOfFlipsToMakeRight("HHHT"));
        System.out.println(minimumNumberOfFlipsToMakeRight("HHHHHH"));
        System.out.println(minimumNumberOfFlipsToMakeRight("HTHHHTHHHTT"));
        System.out.println(minimumNumberOfFlipsToMakeRight("THHTTTHTTTHH"));
        System.out.println(minimumNumberOfFlipsToMakeRight("TTTT"));
    }

    static long minimumNumberOfFlipsToMakeRight(String s) {
        long HCount = 0;
        long TCount = 0;
        for (char c : s.toCharArray()) {
            HCount += c == 'H' ? 1 : 0;
        }

        long minFlip = s.length() - HCount;

        for (char c : s.toCharArray()) {
            if (c == 'H') {
                --HCount;
            } else {
                minFlip = Math.min(minFlip, TCount + HCount);
                ++TCount;
            }
        }
        return minFlip;
    }
}
