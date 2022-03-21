package com.gtxc.practice.maininmain;

/*
    Created by gt at 12:46 AM on Thursday, January 21, 2021.
    Project: practice, Package: maininmain.
*/

public class OtherMain {
    private String name;

    public static void main(String[] args) {
        System.out.println("Other class main called");
    }

    static {
        System.out.println("Other class static called.");
        int someInteger = 5;
    }

    public OtherMain(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void otherOwnedMethod() {
        System.out.println("Owner is Other Class");
    }
}
