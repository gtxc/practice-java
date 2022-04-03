package com.gtxc.practice.fcc;

/*
    Created by gt at 12:01 AM on Monday, April 04, 2022.
    Project: practice, Package: com.gtxc.practice.fcc.
*/


// find first and last index of the target in the sorted array

import java.util.Arrays;

public class PositionFinder {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findFirstAndLastPosition(new int[]{1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 6, 7, 8}, 5)));
        System.out.println(Arrays.toString(findFirstAndLastPosition2(new int[]{1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 6, 7, 8}, 5)));
        System.out.println(Arrays.toString(findFirstAndLastPosition2(new int[]{1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7}, 5)));
    }

    static int[] findFirstAndLastPosition(int[] arr, int target) {
        int[] positions = new int[]{-1, -1};
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == target) {
                positions[0] = i;
                break;
            }
        }

        for (int i = arr.length-1; i >= 0 ; --i) {
            if (arr[i] == target) {
                positions[1] = i;
                break;
            }
        }
        return positions;
    }

    static int[] findFirstAndLastPosition2(int[] arr, int target) {
        int[] positions = new int[]{-1, -1};
        if (arr.length == 0 || arr[0] > target || arr[arr.length-1] < target) return positions;
        positions[0] = findStart(arr, target);
        positions[1] = findEnd(arr, target);
        return positions;
    }

    static int findStart(int[] arr, int target) {
        if (arr[0] == target) return 0;
        int startIndex = 0;
        int endIndex = arr.length - 1;
        while (startIndex <= endIndex) {
            int mid = startIndex + ((endIndex - startIndex) / 2);
            if (target == arr[mid] && target > arr[mid-1]) {
                return mid;
            } else if (target > arr[mid]) {
                startIndex = mid + 1;
            } else {
                endIndex = mid -1;
            }
        }
        return -1;
    }

    static int findEnd(int[] arr, int target) {
        if (arr[arr.length - 1] == target) return arr.length - 1;
        int startIndex = 0;
        int endIndex = arr.length - 1;
        while (startIndex <= endIndex) {
            int mid = startIndex + ((endIndex - startIndex) / 2);
            if (target == arr[mid] && target < arr[mid+1]) {
                return mid;
            } else if (target < arr[mid]) {
                endIndex = mid - 1;
            } else {
                startIndex = mid + 1;
            }
        }
        return -1;
    }
}
