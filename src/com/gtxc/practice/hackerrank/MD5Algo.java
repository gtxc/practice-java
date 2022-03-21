package com.gtxc.practice.hackerrank;

/*
    Created by gt at 9:07 PM on Sunday, February 20, 2022.
    Project: practice, Package: com.gtxc.practice.hackerrank.
*/

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class MD5Algo {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();

        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(s.getBytes(StandardCharsets.UTF_8));
        byte[] d = messageDigest.digest();
        for (byte b : d) {
            System.out.printf("%02x", b);
        }

    }
}
