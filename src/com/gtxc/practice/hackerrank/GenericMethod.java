package com.gtxc.practice.hackerrank;

/*
    Created by gt at 12:44 AM on Tuesday, February 15, 2022.
    Project: practice, Package: com.gtxc.practice.hackerrank.
*/

import java.lang.reflect.Method;

public class GenericMethod {

    public static void main(String[] args) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");

    }
}

class Printer {
    // Write your code here
    public <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }
}
