package com.gtxc.practice.airtiescloudaws;

/*
    Created by gt at 8:59 PM on Sunday, March 27, 2022.
    Project: practice, Package: com.gtxc.practice.airtiescloudaws.
*/

// return true if num is power of 2, otherwise return false

class MathChallenge {

    public static String mathChallenge(int num) {
        // code goes here
        if (num < 1) return "false";
        while (num > 1) {
            if (num % 2 != 0) return "false";
            num /= 2;
        }
        return "true";
    }

    public static void main (String[] args) {
        System.out.println(mathChallenge(1024));
    }
}