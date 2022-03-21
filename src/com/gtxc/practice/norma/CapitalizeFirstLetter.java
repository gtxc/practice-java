package com.gtxc.practice.norma;

/*
    Created by gt at 2:18 AM on Monday, March 07, 2022.
    Project: practice, Package: com.gtxc.practice.norma.
*/

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        System.out.println(capitalizeFirstLetter("gt orc elf GG g"));
        System.out.println(capitalizeFirstLetter("GURKAN tnT elf GG g"));
    }

    static String capitalizeFirstLetter(String str) {
        String[] strArr = str.split(" ");
        StringBuilder capitalized = new StringBuilder();
        for (String s : strArr) {
            capitalized.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).append(" ");
        }
        return capitalized.substring(0, str.length());
    }
}
