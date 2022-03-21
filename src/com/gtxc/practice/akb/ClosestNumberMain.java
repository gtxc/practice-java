package com.gtxc.practice.akb;

/*
    Created by gt at 4:33 PM on Sunday, February 06, 2022.
    Project: practice, Package: com.gtxc.practice.akb.
*/

import java.util.*;

public class ClosestNumberMain {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(2);
//        arr.add(1);
        arr.add(1);
        arr.add(3);

//        arr.add(1);
//        arr.add(1);
//        arr.add(1);
//        arr.add(1);
//        arr.add(1);
//        arr.add(1);

//        arr.add(0);
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        arr.add(4);

//        arr.add((int) -1e9);
//        arr.add((int) 1e9);

        closestNumbers(arr);
    }

    public static int factorial(int n) {
        if (n < 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void closestNumbers(List<Integer> numbers) {
        // Write your code here
        int numbersSize = numbers.size();
        int arraySize = factorial(numbersSize) / (2 * factorial(numbersSize - 2));
        Integer[] left = new Integer[arraySize];  // wrong array size
        Integer[] right = new Integer[arraySize]; // wrong array size

        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();

        Map<Integer, Integer> cls = new HashMap<>();
//        int minDifference = (int) 1e9 + 1;  // wrong init must be 2e9+1
        int minDifference = (int) 2e9 + 1;
        for (int i = 0; i < numbersSize-1; ++i) {
            for (int j = i+1; j < numbersSize; ++j) {
                if (minDifference > Math.abs(numbers.get(i) - numbers.get(j))) {
                    minDifference = Math.abs(numbers.get(i) - numbers.get(j));
                    leftList.clear();
                    rightList.clear();
                    leftList.add(numbers.get(i));
                    rightList.add(numbers.get(j));
                } else if (minDifference == Math.abs(numbers.get(i) - numbers.get(j))) {
                    leftList.add(numbers.get(i));
                    rightList.add(numbers.get(j));
                }
            }
        }

        System.out.println(leftList);
        System.out.println(rightList);
        System.out.println("min dif: " + minDifference);
        int iter = 0;
        for (int i = 0; i < numbersSize-1; ++i) {
            for (int j = i+1; j < numbersSize; ++j) {
                System.out.println("min dif-" + (i+j-1) + ": " + minDifference);
                if (minDifference == Math.abs(numbers.get(i) - numbers.get(j))) {
                    left[iter] = numbers.get(i);
                    right[iter] = numbers.get(j);
                    ++iter;
                }
            }
        }
        System.out.println("left before sort: " + Arrays.toString(left));
        System.out.println("right before sort: " + Arrays.toString(right));
        int itemCont = 1;   // no need to use
        for (int i = 0; i < arraySize-1; ++i) {       // wrong for condition
            for (int j = i+1; j < arraySize; ++j) {   // wrong for condition
                if (left[i] != null && left[j] != null) {
                    if (left[i] > left[j]) {
                        int tmpl = left[i];
                        int tmpr = right[i];
                        left[i] = left[j];
                        right[i] = right[j];
                        left[j] = tmpl;
                        right[j] = tmpr;
                        ++itemCont;     // no need to use
                    }
                }
            }
        }
        System.out.println("left after sort: " + Arrays.toString(left));
        System.out.println("right after sort: " + Arrays.toString(right));
//        for (int i = 0; i < itemCont; ++i) {    // condition i < itemCount wrong
        for (int i = 0; i < arraySize; ++i) {
            int s;
            int l;
            if (left[i] != null && right[i] != null) {  // extra if condition added to check null
                if (left[i] < right[i]) {
                    s = left[i];
                    l = right[i];
                } else {
                    l = left[i];
                    s = right[i];
                }
                System.out.println(s + " " + l);
            }
        }
        System.out.println("iter: " + iter);
        System.out.println("arraySize: " + arraySize);
    }
}
