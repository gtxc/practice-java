package com.gtxc.practice.hackerrank;

/*
    Created by gt at 4:22 PM on Monday, February 14, 2022.
    Project: practice, Package: com.gtxc.practice.hackerrank.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        Map<String, Integer> phoneBook = new HashMap<>();

        for (int i = 0; i < n; ++i) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            phoneBook.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            System.out.println(phoneBook.containsKey(s) ? s + "=" + phoneBook.get(s) : "Not found");
        }
    }
}
