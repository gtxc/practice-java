package com.gtxc.practice.norma;

/*
    Created by gt at 2:24 AM on Monday, March 07, 2022.
    Project: practice, Package: com.gtxc.practice.norma.
*/

public class DigitsHiddenInString {
    public static void main(String[] args) {
        System.out.println(findDigits("Hel9lo m9y1 9l!ittl1e fri1en*d_"));
        System.out.println(findDigits("H12342!ittl1e fri1en*d_"));
    }

    static String findDigits(String str) {
        int sum = 0;
        int letterCount = 0;
        for (int i = 0; i < str.length(); ++i) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
            } else if (Character.isAlphabetic(str.charAt(i))) {
                ++letterCount;
            }
        }
        return String.valueOf(Math.round(sum / (double) letterCount));
    }
}
