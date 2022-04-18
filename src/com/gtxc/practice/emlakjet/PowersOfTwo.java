package com.gtxc.practice.emlakjet;

/*
    Created by gt at 11:25 AM on Monday, April 18, 2022.
    Project: practice, Package: com.gtxc.practice.emlakjet.
*/

/*
* Have the function PowersOfTwo(num) take the num parameter being passed which will be an integer and return the string
* true if it's a power of two. If it's not return the string false. For example if the input is 16 then your program
* should return the string true but if the input is 22 then the output should be the string false.
*
*/

public class PowersOfTwo {

    public static String isPowerOfTwo(int num) {

        int invExpValue = (int) (Math.log(num)/Math.log(2));
        return num == (int) Math.pow(2, invExpValue) ? "true" : "false";
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(17));
    }
}
