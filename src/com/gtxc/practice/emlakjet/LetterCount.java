package com.gtxc.practice.emlakjet;

/*
    Created by gt at 11:27 AM on Monday, April 18, 2022.
    Project: practice, Package: com.gtxc.practice.emlakjet.
*/

/*
 * Have the function LetterCount(str) take the str parameter being passed and return the first word with the greatest
 * number of repeated letters. For example: "Today, is the greatest day ever!" should return greatest because it has
 * 2 e's (and 2 t's) and it comes before ever which also has 2 e's. If there are no words with repeating letters
 * return -1. Words will be separated by spaces.
 *
 */

public class LetterCount {

    public static String letterCount(String str) {
        String[] wordArray = str.split(" ");
        String wordHasLargerRepeatedLetters = "-1";
        int maxRepetition = 0;
        for (String w : wordArray) {
            int[] alph = new int[256];

            int maxRepeatInAWord = 0;

            for (int i = 0; i < w.length(); ++i) {
                ++alph[w.charAt(i)];

                if (alph[w.charAt(i)] > maxRepeatInAWord) {
                    maxRepeatInAWord = alph[w.charAt(i)];
                }
            }

            if (maxRepeatInAWord > 1 && maxRepeatInAWord > maxRepetition) {
                maxRepetition = maxRepeatInAWord;
                wordHasLargerRepeatedLetters = w;
            }
        }

        return wordHasLargerRepeatedLetters;
    }

    public static void main(String[] args) {
        System.out.println(letterCount("Toodaay, iis !!!! the greeeeatest day ever!"));
    }
}
