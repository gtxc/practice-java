package com.gtxc.practice.ntt;

/*
    Created by gt at 1:55 AM on Monday, February 21, 2022.
    Project: practice, Package: com.gtxc.practice.ntt.
*/

public class AccountMain {

    public static void main(String[] args) {
        Account ac1 = new Account("Orc", 2, 1);
        Account ac2 = new Account("Elf", 5, 8);

        System.out.println(ac1);
        System.out.println(ac2);
        System.out.println(ac1.compareTo(ac2) < 0 ? "Orc pays lower than Elf" : "Elf pays lower than Orc");
    }
}
