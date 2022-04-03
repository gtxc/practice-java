package com.gtxc.practice.ctci;

/*
    Created by gt at 3:33 PM on Sunday, April 03, 2022.
    Project: practice, Package: com.gtxc.practice.ctci.
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EquationSolver {

    public static void main(String[] args) {
//        bruteForce();
//        a3plusb3equalsc3plusd3();
        baac();
    }

    static void bruteForce() {
        int n = 100;
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
                for (int k = 1; k <= n; ++k) {
                    for (int l = 1; l <= n; ++l) {
                        if (Math.pow(i, 3) + Math.pow(j, 3) == Math.pow(k, 3) + Math.pow(l, 3)) {
                            System.out.printf("%5d%5d%5d%5d\n", i, j, k, l);
                        }
                    }
                }
            }
        }
    }

    static void a3plusb3equalsc3plusd3() {
        int n = 100;
        Map<Integer, List<Integer>> resultMap = new HashMap<>();
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
                int result = (int) (Math.pow(i, 3) + Math.pow(j, 3));
                List<Integer> list = new ArrayList<>();
                list.add(i);
                list.add(j);
                resultMap.put(result, list);
            }
        }

        for (Map.Entry<Integer, List<Integer>> e : resultMap.entrySet()) {
            for (Integer p1 : e.getValue()) {
                System.out.print(p1 + " ");
            }
            System.out.println();
        }
    }

    static void baac() {
        /*
        Given equation:
        AAA + BBB + CCC = BAAC
        it can be rewrite as
        111*A + 111*B + 111*C = 1000*B + 110A + C
        simplifying it yields,
        A - 889*B + 110*C = 0
         */

        for (int j = 1; j < 10; j++) {
            for (int k = 1; k < 10; k++) {
                int i = 889 * j - 110 * k;
                if (i >= 1 && i <= 9) {
                    System.out.println("A = " + i);
                    System.out.println("B = " + j);
                    System.out.println("C = " + k);
                }
            }
        }
    }
}
