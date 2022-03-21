package com.gtxc.practice.hackerrank;

/*
    Created by gt at 12:52 AM on Tuesday, February 08, 2022.
    Project: practice, Package: hackerrank.
*/


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.joining;



class Result {

    /*
     * Complete the 'evenOdd' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr
     *  2. 2D_INTEGER_ARRAY operations
     */

    public static List<Integer> evenOdd(List<Integer> arr, List<List<Integer>> operations) {
        // Write your code here
        for (int i = 0; i < operations.size(); ++i) {
            if (operations.get(i).get(0) == 1) {
                arr.set(operations.get(i).get(1), operations.get(i).get(2));
            } else if (operations.get(i).get(0) == 2) {
                int pairs = 0;
                for (int j = operations.get(i).get(1); j < operations.get(i).get(2); ++j) {
                    for (int k = j+1; k <= operations.get(i).get(2); ++k) {
                        if (arr.get(j) % 2 == 1 && arr.get(k) % 2 == 0) {
                            ++pairs;
                        }
                        if (arr.get(operations.get(i).get(2)-j) % 2 == 1 && arr.get(operations.get(i).get(2)-k) % 2 == 0) {
                            ++pairs;
                        }
                    }
                }
                 System.out.println(pairs % ((int) 1e9 + 7));
            }
        }

        for (int i = 0; i < arr.size(); ++i) {
            arr.set(i, arr.get(i) % ((int) 1e9 + 7));
        }
        return arr;
    }

}

public class EvenOddMain {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

//        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
//        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
//                    try {
//                        return bufferedReader.readLine().replaceAll("\\s+$", "");
//                    } catch (IOException ex) {
//                        throw new RuntimeException(ex);
//                    }
//                })
//                .map(String::trim)
//                .map(Integer::parseInt)
//                .collect(toList());

//        int operationsRows = Integer.parseInt(bufferedReader.readLine().trim());
//        int operationsColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> operations = new ArrayList<>();
        List<Integer> op1 = new ArrayList<>();
        op1.add(2);
        op1.add(0);
        op1.add(2);
        List<Integer> op2 = new ArrayList<>();
        op2.add(2);
        op2.add(3);
        op2.add(4);
        List<Integer> op3 = new ArrayList<>();
        op3.add(1);
        op3.add(0);
        op3.add(9);
        operations.add(op1);
        operations.add(op2);
        operations.add(op3);

//        IntStream.range(0, operationsRows).forEach(i -> {
//            try {
//                operations.add(
//                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                                .map(Integer::parseInt)
//                                .collect(toList())
//                );
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });

        List<Integer> result = Result.evenOdd(arr, operations);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

//        bufferedReader.close();
        bufferedWriter.close();
    }
}

