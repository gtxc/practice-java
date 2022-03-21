package com.gtxc.practice.hackerrank;

/*
    Created by gt at 1:48 PM on Wednesday, February 09, 2022.
    Project: practice, Package: com.gtxc.practice.hackerrank.
*/

import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;


public class EndOfFileMain {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        StringBuilder s = new StringBuilder();
        System.out.println("Enter your text: ");
        int line = 0;
        while (scanner.hasNextLine()) {
            s.append(scanner.nextLine());
            s.append("\n");
            ++line;
        }

//        String s = "gurkan\nturkarslan\nelif\ngirgin\n";
//        int line = 5;
        char[] sarr = s.toString().toCharArray();
//        System.out.println(s);
        int index = -1;
        for (int i = 1; i <= line; ++i) {
            System.out.print(i + " ");
            ++index;
            while (sarr[index] != '\n') {
                System.out.print(sarr[index]);
                ++index;
            }
            System.out.println();
        }
        scanner.close();
    }
}