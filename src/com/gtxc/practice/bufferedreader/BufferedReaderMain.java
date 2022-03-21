package com.gtxc.practice.bufferedreader;

/*
    Created by gt at 1:54 PM on Monday, January 25, 2021.
    Project: practice, Package: bufferedreader.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderMain {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/com/gtxc/practice/bufferedreader/textFile.txt"));) {
            System.out.println(bufferedReader.lines().count()); // this moves the pointer to the EOF
            for (int i = 0; i < bufferedReader.lines().count(); i++) {
                System.out.println(bufferedReader.lines().count());
                System.out.println("before readLine()");
                System.out.println(bufferedReader.readLine());
                System.out.println("after readLine()");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
