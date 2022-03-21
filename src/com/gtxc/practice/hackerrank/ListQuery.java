package com.gtxc.practice.hackerrank;

/*
    Created by gt at 3:38 PM on Monday, February 14, 2022.
    Project: practice, Package: com.gtxc.practice.hackerrank.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListQuery {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        List<Integer> L = new ArrayList<>();

        for (int i = 0; i < N; ++i) {
            L.add(scanner.nextInt());
        }

        int Q = scanner.nextInt();

        for (int i = 0; i < Q; ++i) {
            String query = scanner.next();
            if (query.equals("Insert")) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                L.add(x, y);
            }
            if (query.equals("Delete")) {
                int x = scanner.nextInt();
                L.remove(x);
            }
        }

        for (int i = 0; i < L.size() - 1; ++i) {
            System.out.print(L.get(i) + " ");
        }
        System.out.print(L.get(L.size() - 1));

        scanner.close();
    }
}
