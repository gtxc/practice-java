package com.gtxc.practice.airtiescloudaws;

/*
    Created by gt at 8:02 PM on Sunday, March 27, 2022.
    Project: practice, Package: com.gtxc.practice.airtiescloudaws.
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringArithmetic {

    public static String stringArithmetic(String str) {
        // code goes here

        String digitRegex = "zero|one|two|three|four|five|six|seven|eight|nine";
        String signRegex = "plus|minus";

        String[] numStrArr = str.split(signRegex);
        String[] opStrArr = str.split(digitRegex);

        Pattern p = Pattern.compile(digitRegex);

        int[] resultDigits = new int[numStrArr.length];
        int resultIndex = 0;

        for (String s : numStrArr) {
            Matcher m = p.matcher(s);
            StringBuilder number = new StringBuilder();
            while (m.find()) {
                String digitString = m.group();
                String digit = "";
                switch (digitString) {
                    case "zero":
                        digit = "0";
                        break;
                    case "one":
                        digit = "1";
                        break;
                    case "two":
                        digit = "2";
                        break;
                    case "three":
                        digit = "3";
                        break;
                    case "four":
                        digit = "4";
                        break;
                    case "five":
                        digit = "5";
                        break;
                    case "six":
                        digit = "6";
                        break;
                    case "seven":
                        digit = "7";
                        break;
                    case "eight":
                        digit = "8";
                        break;
                    case "nine":
                        digit = "9";
                        break;
                }

                number.append(digit);
            }
            resultDigits[resultIndex++] = Integer.parseInt(number.toString());
        }

        int result = resultDigits[0];
        int opIndex = 0;
        for (int i = 0; i < resultDigits.length - 1; ++i) {
            while (opStrArr[opIndex].equals("")) {++opIndex;}
            if (opStrArr[opIndex].equals("plus")) {
                result = result + resultDigits[i+1];
            } else if (opStrArr[opIndex].equals("minus")) {
                result = result - resultDigits[i+1];
            }
            ++opIndex;
        }

        Pattern pp = Pattern.compile("[0-9]");
        Matcher mm = pp.matcher(String.valueOf(result));
        StringBuilder resultString = new StringBuilder();
        if (result < 0) resultString.append("negative");
        while (mm.find()) {
            switch (mm.group()) {
                case "0":
                    resultString.append("zero");
                    break;
                case "1":
                    resultString.append("one");
                    break;
                case "2":
                    resultString.append("two");
                    break;
                case "3":
                    resultString.append("three");
                    break;
                case "4":
                    resultString.append("four");
                    break;
                case "5":
                    resultString.append("five");
                    break;
                case "6":
                    resultString.append("six");
                    break;
                case "7":
                    resultString.append("seven");
                    break;
                case "8":
                    resultString.append("eight");
                    break;
                case "9":
                    resultString.append("nine");
                    break;
            }
        }
        return resultString.toString();
    }

    public static void main (String[] args) {
        System.out.println("twotwotwominusfivefivefive: " + stringArithmetic("twotwotwominusfivefivefive"));
        System.out.println("onetwoplusoneone: " + stringArithmetic("onetwoplusoneone"));
    }
}
