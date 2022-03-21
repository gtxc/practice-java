package com.gtxc.practice.hackerrank;

/*
    Created by gt at 1:48 AM on Monday, February 14, 2022.
    Project: practice, Package: com.gtxc.practice.hackerrank.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Hourglass {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int[][] arr2d = arr.stream().map(u -> u.stream().mapToInt(i -> i).toArray()).toArray(int[][]::new);

        int max = -64;
        for (int i = 1; i < arr2d.length - 1; ++i) {
            for (int j = 1; j < arr2d[0].length - 1; ++j) {
                int sum = arr2d[i-1][j-1] + arr2d[i-1][j] + arr2d[i-1][j+1] +
                                             arr2d[i][j] +
                          arr2d[i+1][j-1] + arr2d[i+1][j] + arr2d[i+1][j+1];
                if (max < sum) {
                    max = sum;
                }
            }
        }
        System.out.println(max);

        bufferedReader.close();
    }
}
