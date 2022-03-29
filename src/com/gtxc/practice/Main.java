package com.gtxc.practice;

import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Calendar calendar = new GregorianCalendar(2015, 7, 5);
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        System.out.println(sdf.format(calendar.getTime()).toUpperCase());

        List<List<Integer>> a = new ArrayList<>();
        ArrayList<Integer> asd = new ArrayList<>();
        asd.ensureCapacity(1);
        LinkedList<Integer> assd = new LinkedList<>();
        assd.addFirst(1);


        int[][] A = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

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