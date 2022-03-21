package com.gtxc.practice.hackerrank;

/*
    Created by gt at 4:19 PM on Sunday, February 13, 2022.
    Project: practice, Package: com.gtxc.practice.hackerrank.
*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();

            //Write your code here
            String regex = "<(.+)>([^<]+)</\\1>";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(line);


            if (!m.find()) {
                System.out.println("None");
            }

            m.reset();
            while (m.find()) {
                System.out.println(m.group(2));
            }

            testCases--;
        }
    }
}
