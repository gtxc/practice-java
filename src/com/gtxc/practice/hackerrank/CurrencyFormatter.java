package com.gtxc.practice.hackerrank;

/*
    Created by gt at 5:06 PM on Wednesday, February 09, 2022.
    Project: practice, Package: com.gtxc.practice.hackerrank.
*/

import sun.reflect.generics.tree.FormalTypeParameter;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double payment = scanner.nextDouble();
//        scanner.close();

        double payment = 1223.1231;
        // Write your code here.
        System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(payment));
        System.out.println("India: " + NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment));
        System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
        System.out.println("France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));
    }
}
