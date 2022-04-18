package com.gtxc.practice.emlakjet;

/*
    Created by gt at 12:00 PM on Monday, April 18, 2022.
    Project: practice, Package: com.gtxc.practice.emlakjet.
*/

/*
 * Have the function ThreeFiveMultiples(num) return the sum of all the multiples of 3 and 5 that are below num. For
 * example: if num is 10, the multiples of 3 and 5 that are below 10 are 3, 5, 6, and 9, and adding them up you get 23,
 * so your program should return 23. The integer being passed will be between 1 and 100.
 *
 */

public class ThreeFiveMultiples {

    public static int threeFiveMultiples(int num) {
        // code goes here
        --num;
        int threeDivisibleSum = ((num/3) * (num/3 + 1)) / 2 * 3;
        int fiveDivisibleSum = ((num/5) * (num/5 + 1)) / 2 * 5;
        int fifteenDivisibleSum = ((num/15) * (num/15 + 1)) / 2 * 15;

        return threeDivisibleSum + fiveDivisibleSum - fifteenDivisibleSum;
    }

    public static void main(String[] args) {
        System.out.println(threeFiveMultiples(8));
    }
}
