package com.gtxc.practice.tostringtest;

/*
    Created by gt at 2:04 AM on Friday, January 15, 2021.
    Project: practice, Package: tostringtest.
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class ToStringMain {
    public static void main(String[] args) {
        Person gurk = new Person(29, "Gurkan Turkarslan", "Software Engineer");
        System.out.println(gurk.getName() + " " + gurk.getJob());
        System.out.println(gurk);

        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        LinkedList<String> stringLinkedList = new LinkedList<>();

        int[] intArray = {23, 324, 1, 43, 5, 2, 54, 100, 23};
        String s = "This is an unordered set of words";
        String[] stringArray = s.split(" ");

        for (int i : intArray) {
            integerLinkedList.add(i);
        }

        Collections.addAll(stringLinkedList, stringArray);

        System.out.println(Arrays.toString(integerLinkedList.toArray()));
        System.out.println(Arrays.toString(stringLinkedList.toArray()));


    }
}

class Person implements Comparable {
    private int age;
    private String name;
    private String job;

    public Person(int age, String name, String job) {
        this.age = age;
        this.name = name;
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        System.out.println("compareTo() called");
        return 0;
    }
}
