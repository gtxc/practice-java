package com.gtxc.practice.hackerrank;

/*
    Created by gt at 1:32 AM on Sunday, February 13, 2022.
    Project: practice, Package: com.gtxc.practice.hackerrank.
*/

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int testCases = Integer.parseInt(in.nextLine());

        while(testCases > 0){
            String pattern = in.nextLine();
            //Write your code
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException ignore) {
                System.out.println("Invalid");
            }
            --testCases;
        }
    }
}
