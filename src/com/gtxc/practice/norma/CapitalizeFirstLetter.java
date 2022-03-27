package com.gtxc.practice.norma;

/*
    Created by gt at 2:18 AM on Monday, March 07, 2022.
    Project: practice, Package: com.gtxc.practice.norma.
*/

import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        System.out.println(capitalizeFirstLetter("gt orc elf GG g"));
        System.out.println(capitalizeFirstLetter("GURKAN tnT elf GG g"));
    }

    static String capitalizeFirstLetter(String str) {
        return Arrays.stream(str.split(" "))
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1))
                .collect(Collectors.joining(" "));
    }
}
