package com.gtxc.practice.maininmain;

/*
    Created by gt at 12:46 AM on Thursday, January 21, 2021.
    Project: practice, Package: maininmain.
*/

public class MainMain {
    public static void main(String[] args) {
        OtherMain other = new OtherMain("Gurk");
        System.out.println(other.getName());
//        Other.main(args);
        OtherMain.otherOwnedMethod();
    }
}
