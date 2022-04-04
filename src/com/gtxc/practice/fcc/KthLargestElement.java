package com.gtxc.practice.fcc;

/*
    Created by gt at 9:14 AM on Monday, April 04, 2022.
    Project: practice, Package: com.gtxc.practice.fcc.
*/

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {

    public static void main(String[] args) {
        System.out.println(findKthLargestElement(new int[]{1,2,3,4,5,6,7,8,9}, 3));
        System.out.println(findKthLargestElement(new int[]{9,8,7,6,5,4,3,2,1}, 3));
    }

    static int findKthLargestElement(int[] arr, int k) {
//        Arrays.sort(arr);
        findLargestPriorityQueue(arr);
        mergeSort(arr);
        return arr[arr.length-k];
    }

    static void merge(int[] A, int low, int mid, int high) {
        int[] tmp = new int[high+1];
        int i = low;
        int j = mid+1;
        int k = low;

        while (i <= mid && j <= high) {
            if (A[i] <= A[j]) {
                tmp[k++] = A[i++];
            } else {
                tmp[k++] = A[j++];
            }
        }
        while (i <= mid) {
            tmp[k++] = A[i++];
        }
        while (j <= high) {
            tmp[k++] = A[j++];
        }
        for (k = low; k <= high; ++k) {
            A[k] = tmp[k];
        }
        // echo each step
//        System.out.println(Arrays.toString(A));
    }

    static void partition(int[] A, int low, int high) {
        // echo each step
//        System.out.println(Arrays.toString(A));
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        partition(A, low, mid);
        partition(A, mid+1, high);
        merge(A, low, mid, high);
    }

    static void mergeSort(int[] A) {
        partition(A, 0, A.length-1);
    }

    static void findLargestPriorityQueue(int[] arr) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (Integer item : arr) {
            queue.add(item);
        }
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
