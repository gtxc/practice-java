package com.gtxc.practice.hackerrank;

/*
    Created by gt at 1:47 AM on Sunday, February 13, 2022.
    Project: practice, Package: com.gtxc.practice.hackerrank.
*/

import java.util.Scanner;

public class IPCheckerRegex {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

final class MyRegex {
//    public final String pattern = "(\\d{1,3}\\.){3}\\d{1,3}";
//    public final String pattern = "(\\d|2[0-5][0-5]\\d\\d\\.){3}\\d|2[0-5][0-5]\\d\\d";
//    public final String pattern = "(\\d|2[0-5][0-5])\\d";
    public final String pattern = "\\b((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)(\\.|$)){4}\\b";
}