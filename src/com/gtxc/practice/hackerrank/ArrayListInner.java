package com.gtxc.practice.hackerrank;

/*
    Created by gt at 2:36 AM on Monday, February 14, 2022.
    Project: practice, Package: com.gtxc.practice.hackerrank.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListInner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();

        List<List<Integer>> A = new ArrayList<>();

        for (int i = 0; i < lines; ++i) {
            int n = scanner.nextInt();
            List<Integer> Asub = new ArrayList<>();
            for (int j = 0; j < n; ++j) {
                Asub.add(scanner.nextInt());
            }
            A.add(Asub);
        }

        int q = scanner.nextInt();
        for (int i = 0; i < q; ++i) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            try {
                System.out.println(A.get(x-1).get(y-1));
            } catch (IndexOutOfBoundsException ignored) {
                System.out.println("ERROR!");
            }
        }
        scanner.close();
    }
}
