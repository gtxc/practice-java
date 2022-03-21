package com.gtxc.practice.turkiyesigorta;

/*
    Created by gt at 1:57 AM on Monday, February 21, 2022.
    Project: practice, Package: com.gtxc.practice.turkiyesigorta.
*/

import java.util.*;

public class EmpTimeSlot {

    public static char findMaxWorkedEmpTimeSlot(List<List<Integer>> arr) {
        int arrSize = arr.size();
        List<Integer> diff = new ArrayList<>(arrSize);
        diff.add(arr.get(0).get(1));
        for (int i = 1; i < arrSize; ++i) {
            diff.add(arr.get(i).get(1) - arr.get(i-1).get(1));
        }
        int empIndexLongestSlot = diff.indexOf(Collections.max(diff));
        int empID = arr.get(empIndexLongestSlot).get(0);

        return (char) (empID + 97);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        List<List<Integer>> schedule = new ArrayList<>(n);
        for (int i = 0; i < n; ++i) {
            int[] s = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            List<Integer> row = new ArrayList<>();
            row.add(s[0]);
            row.add(s[1]);
            schedule.add(row);
        }
        scanner.close();

        char empOfMonth = findMaxWorkedEmpTimeSlot(schedule);
        System.out.println(empOfMonth);
    }
}
