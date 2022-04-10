package com.gtxc.practice.curiosity;

/*
    Created by gt at 10:20 PM on Sunday, April 10, 2022.
    Project: practice, Package: com.gtxc.practice.curiosity.
*/

public class Diagonal {

    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int rowCount = A.length;
        int colCount = A[0].length;

        // Diagonal with 2 for, [O(n2)]
        // for i = 0 : rowCount
        //     for j = 0 : colCount
        //         if  i == j
        //             A[i][j]

        // Diagonal with 1 for (works only for NxN matrices, [O(n)]
        // for i = 0 : rowCount
        //     A[i][i]

        // Trace all elements in 2d array with 1 for, [O(n2)]
        // for i = 0 : rowCount * colCount
        //     A[i / colCount][i % colCount]
    }
}
