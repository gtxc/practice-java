package com.gtxc.practice.hackerrank;

/*
    Created by gt at 3:55 PM on Sunday, February 13, 2022.
    Project: practice, Package: com.gtxc.practice.hackerrank.
*/

import java.util.Scanner;

class UsernameValidator {

    public static final String regularExpression = "\\b(^[a-zA-Z])\\w{7,29}\\b";
}

public class UsernameValidatorMain {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}