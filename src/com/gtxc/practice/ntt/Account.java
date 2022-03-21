package com.gtxc.practice.ntt;

/*
    Created by gt at 3:00 PM on Monday, February 07, 2022.
    Project: practice, Package: com.gtxc.practice.ntt.
*/

public class Account implements BasePrice, Comparable<Account>{

    private String ownerName;
    private int noOfExclusiveContent;
    private int noOfMatureContent;

    public Account(String ownerName, int noOfExclusiveContent, int noOfMatureContent) {
        this.ownerName = ownerName;
        this.noOfExclusiveContent = noOfExclusiveContent;
        this.noOfMatureContent = noOfMatureContent;
    }

    public int getMonthlyCost() {
        return basePrice + (noOfExclusiveContent * exclusiveContent) + (noOfMatureContent * adultContent);
    }

    @Override
    public int compareTo(Account account) {
        return this.getMonthlyCost() - account.getMonthlyCost();
    }

    @Override
    public String toString() {
        return "Account name is " + this.ownerName + " and monthly cost is " + this.getMonthlyCost() + " USD.";
    }
}
