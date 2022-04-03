package com.gtxc.practice.ctci;

/*
    Created by gt at 6:48 PM on Sunday, April 03, 2022.
    Project: practice, Package: com.gtxc.practice.ctci.
*/


// Give a list of people with their birth and death years,
// find the year with the highest population.

import java.util.HashMap;

public class PeoplePopulation {

    public static void main(String[] args) {
        int[][] years = new int[][]{
                {2000, 2010},
                {1975, 2005},
                {1975, 2003},
                {1803, 1809},
                {1750, 1869},
                {1840, 1935},
                {1803, 1921},
                {1894, 1921}
        };
        System.out.println(getPopulationPeaks(years));
        System.out.println(findMaxPopulation(years));
    }

    static int findMaxPopulation(int[][] arr) {
        int yearMin = Integer.MAX_VALUE;
        int yearMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; ++i) {
            if (yearMin > arr[i][0]) {
                yearMin = arr[i][0];
            }

            if (yearMax < arr[i][0]) {
                yearMax = arr[i][0];
            }
        }

        HashMap<Integer, Integer> yearPop = new HashMap<>();

        for (int i = yearMin; i <= yearMax; ++i) {
        int pop = 0;
            for (int j = 0; j < arr.length; ++j) {
                if (arr[j][0] <= i && arr[j][1] >= i) {
                    ++pop;
                }
            }
            yearPop.put(i, pop);
        }

        int maxPopYear = -1;
        int maxPop = 0;
        for (int i = yearMin; i <= yearMax; ++i) {
            if (yearPop.get(i) > maxPop) {
                maxPop = yearPop.get(i);
                maxPopYear = i;
            }
        }
        System.out.println(maxPop);
        return maxPopYear;
    }








    static int getPopulationPeaks(int[][] people) {
        int firstBirth = getMinBirth(people);
        int lastBirth = getMaxBirth(people);
        int[] deltas = getDeltas(people, firstBirth, lastBirth);
        int peakYearOffset = getMaxRunningSumIndex(deltas);
        return peakYearOffset + firstBirth;
    }

    static int getMinBirth(int[][] people) {
        int minBirth = Integer.MAX_VALUE;
        for (int[] person : people) {
            if (minBirth > person[0]) {
                minBirth = person[0];
            }
        }
        return minBirth;
    }

    static int getMaxBirth(int[][] people) {
        int maxBirth = Integer.MIN_VALUE;
        for (int[] person : people) {
            if (maxBirth < person[0]) {
                maxBirth = person[0];
            }
        }
        return maxBirth;
    }

    static int[] getDeltas(int[][] people, int firstBirth, int lastBirth) {
        int[] deltas = new int[lastBirth - firstBirth + 1];
        for (int[] person : people) {
            addDelta(deltas, person[0]-firstBirth, 1);
            addDelta(deltas, person[1]-firstBirth, -1);
        }
        return deltas;
    }

    static void addDelta(int[] deltas, int index, int count) {
        if (index < deltas.length) {
            deltas[index] += count;
        }
    }

    static int getMaxRunningSumIndex(int[] deltas) {
        int runningSum = 0;
        int maxRunningSum = 0;
        int yearOfPeak = 0;
        for (int year = 0; year < deltas.length; ++year) {
            runningSum += deltas[year];
            if (runningSum > maxRunningSum) {
                maxRunningSum = runningSum;
                yearOfPeak = year;
            }
        }
        return yearOfPeak;
    }
}
