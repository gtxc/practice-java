package com.gtxc.practice.airtiescloudaws;

/*
    Created by gt at 9:18 PM on Sunday, March 27, 2022.
    Project: practice, Package: com.gtxc.practice.airtiescloudaws.
*/

// return true if the greatest integer in array is obtained by combining
// any of the elements in the array except the greatest, otherwise return false

import java.util.Arrays;

public class ArrayChallenge {

    public static String arrayChallenge(int[] arr) {
        // code goes here
        Arrays.sort(arr);
        int[] pSum = new int[arr.length];
        pSum[0] = arr[0];
        int arrMax = arr[arr.length-1];
        int tmp = arr[0];
        for (int i = 1; i < arr.length - 1; ++i) {
            pSum[i] = pSum[i-1] + arr[i];
            if (arrMax >= tmp) {tmp = pSum[i];}
            else {break;}
        }

        if (arrMax == tmp) {return "true";}

        for (int j : arr) {
            if (arrMax == tmp - j) {return "true";}
        }

        return "false";
    }

    public static void main (String[] args) {
        // keep this function call here
        System.out.println(arrayChallenge(new int[]{1, 2, 3, 4, 5, 16}));
    }
}
