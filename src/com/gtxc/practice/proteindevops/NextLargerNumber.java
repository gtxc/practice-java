package com.gtxc.practice.proteindevops;

/*
    Created by gt at 3:21 PM on Monday, April 18, 2022.
    Project: practice, Package: com.gtxc.practice.proteindevops.
*/

/*
 * Find next larger int using same digits
 *
 */

import java.util.Arrays;

public class NextLargerNumber {

    public static int findNextLarger(int num) {

        String numAsString = String.valueOf(num);
        int digitCount = numAsString.length();
        int[] numAsIntArray = new int[digitCount];

        for (int digit = 0; digit < digitCount; ++digit) {
            numAsIntArray[digit] = Integer.parseInt(String.valueOf(numAsString.charAt(digit)));
        }

        int i;

        for (i = digitCount - 1; i > 0; --i) {
            if (numAsIntArray[i] > numAsIntArray[i - 1]) {
                int tmp = numAsIntArray[i];
                numAsIntArray[i] = numAsIntArray[i - 1];
                numAsIntArray[i - 1] = tmp;
                break;
            }
        }

        Arrays.sort(numAsIntArray, i, digitCount);
        int nextLarger = 0;

        for (int digit : numAsIntArray) {
            nextLarger = nextLarger * 10 + digit;
        }

        return num != nextLarger ? nextLarger : -1;
    }

    public static void main(String[] args) {
        System.out.println(findNextLarger(42543));
    }
}
