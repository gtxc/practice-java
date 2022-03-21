package com.gtxc.practice.turkiyesigorta;

/*
    Created by gt at 1:57 AM on Monday, February 21, 2022.
    Project: practice, Package: com.gtxc.practice.turkiyesigorta.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PSumMain {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(-3);
        arr.add(0);
        arr.add(2);
        arr.add(1);
        System.out.println("result: " + maxPosPrefixes(arr));
    }

    public static int maxPosPrefixes(List<Integer> arr) {
        // Write your code here

        Long[] pSum = new Long[arr.size()];
        List<Integer> sortedArr = new ArrayList<>(arr);
        sortedArr.sort(Collections.reverseOrder());

        pSum[0] = Long.valueOf(sortedArr.get(0));
        int pCount = pSum[0] > 0 ? 1 : 0;

        for (int i = 1; i < arr.size(); ++i) {
             pSum[i] = pSum[i-1] + sortedArr.get(i);
             if (pSum[i] > 0) {
                 ++pCount;
             }
        }

        return pCount;
    }
}
