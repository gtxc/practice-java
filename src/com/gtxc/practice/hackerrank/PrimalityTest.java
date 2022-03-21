package com.gtxc.practice.hackerrank;

/*
    Created by gt at 11:17 PM on Sunday, February 13, 2022.
    Project: practice, Package: com.gtxc.practice.hackerrank.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class PrimalityTest {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();


        System.out.println(new BigInteger(n).isProbablePrime(1) ? "prime" : "not prime");
        bufferedReader.close();
    }

}
