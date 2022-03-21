package com.gtxc.practice.hackerrank;

/*
    Created by gt at 11:44 PM on Sunday, February 13, 2022.
    Project: practice, Package: com.gtxc.practice.hackerrank.
*/

import java.math.BigInteger;
import java.util.Scanner;

public class BigNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();


        BigInteger sum = new BigInteger(a).add(new BigInteger(b));
        BigInteger mul = new BigInteger(a).multiply(new BigInteger(b));
        System.out.println(new BigInteger(a).add(new BigInteger(b)));
        System.out.println(new BigInteger(a).multiply(new BigInteger(b)));
    }
}
