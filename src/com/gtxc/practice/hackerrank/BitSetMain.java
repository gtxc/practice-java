package com.gtxc.practice.hackerrank;

/*
    Created by gt at 1:18 PM on Tuesday, February 15, 2022.
    Project: practice, Package: com.gtxc.practice.hackerrank.
*/

import java.util.BitSet;
import java.util.Scanner;

public class BitSetMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        BitSet[] bitArray = {new BitSet(N), new BitSet(N)};

        while (M-- > 0) {
            String operation = scanner.next();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            switch (operation) {
                case "AND":
                    bitArray[x-1].and(bitArray[y-1]);
                    break;
                case "OR":
                    bitArray[x-1].or(bitArray[y-1]);
                    break;
                case "XOR":
                    bitArray[x-1].xor(bitArray[y-1]);
                    break;
                case "FLIP":
                    bitArray[x-1].flip(y);
                    break;
                case "SET":
                    bitArray[x-1].set(y);
                    break;
            }
            System.out.println(bitArray[0].cardinality() + " " + bitArray[1].cardinality());
        }
        scanner.close();
    }
}