package com.gtxc.practice.ctci;

/*
    Created by gt at 12:19 AM on Sunday, April 03, 2022.
    Project: practice, Package: com.gtxc.practice.ctci.
*/

import java.util.Arrays;
import java.util.Hashtable;

public class IntegerPairsWithCertainDifference {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 7, 5, 9, 2, 12, 3};

        integerPairsWithCertainDifference(arr, 2);
        integerPairsWithCertainDifference2(arr, 2);
        integerPairsWithCertainDifference3(arr, 2);
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 12));
        System.out.println(searchInSortedArray(arr, 1));
        System.out.println(searchInSortedArrayRecursive(arr, 1));
    }

    static void integerPairsWithCertainDifference(int[] arr, int diff) {
        for (int i = 0; i < arr.length-1; ++i) {
            for (int j = i+1; j < arr.length; ++j) {
                if (Math.abs(arr[i] - arr[j]) == diff) {
                    System.out.println("(" + arr[i] + "," + arr[j] + ")");
                }
            }
        }
    }

    static void integerPairsWithCertainDifference2(int[] arr, int diff) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; ++i) {
            int lowIndex = searchInSortedArray(arr, arr[i] - diff);
            int highIndex = searchInSortedArray(arr, arr[i] + diff);
            if (lowIndex >= 0) {
                System.out.println("(" + arr[i] + "," + arr[lowIndex] + ")");
            } else if (highIndex >= 0) {
                System.out.println("(" + arr[i] + "," + arr[highIndex] + ")");
            }
        }
    }

    static void integerPairsWithCertainDifference3(int[] arr, int diff) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        for (Integer item : arr) {
            hashtable.put(item, item);
        }
        for (Integer item : arr) {
            if (hashtable.containsValue(item + diff)) {
                System.out.println("(" + item + "," + hashtable.get(item + diff) + ")");
            } else if (hashtable.containsValue(item - diff)) {
                System.out.println("(" + item + "," + hashtable.get(item - diff) + ")");
            }
        }
    }


        static int searchInSortedArray(int[] arr, int n) {
        int index = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2); // avoid (start+end)/2 in case of an overflow
            if (n > arr[mid]) {
                start = mid + 1;
            } else if (n < arr[mid]) {
                end = mid - 1;
            } else if (n == arr[mid]) {
                index = mid;
                break;
            }
        }
        return index;
    }

    static int searchInSortedArrayRecursive(int[] arr, int n) {
        return searchInSortedArrayRecursiveHelper(arr, n, 0, arr.length - 1);
    }

    static int searchInSortedArrayRecursiveHelper(int[] arr, int n, int start, int end) {
        if (start > end) return -1;

        int mid = start + ((end - start) / 2);
        if (n == arr[mid]) {
            return mid;
        } else if (n < arr[mid]) {
            return searchInSortedArrayRecursiveHelper(arr, n, start, mid - 1);
        } else {
            return searchInSortedArrayRecursiveHelper(arr, n, mid + 1, end);
        }
    }
}
