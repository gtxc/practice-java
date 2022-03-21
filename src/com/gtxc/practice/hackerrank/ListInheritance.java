package com.gtxc.practice.hackerrank;

/*
    Created by gt at 11:04 PM on Monday, February 07, 2022.
    Project: practice, Package: hackerrank.
*/

import java.util.ArrayList;
import java.util.Random;


interface MyList{
    void convert(String[] a);
    void replace(int idx);
    ArrayList<String> compact();
}
/*
Write the implementation of the InvalidStringException and the ArrayToList classes
Model strings for cut and paste:
I have added the string: {string} at the index: {index}
I have replaced the string: {string} with a null string
*/

class InvalidStringException extends Exception {

    InvalidStringException(String msg) {
        super(msg);
    }
}

class ArrayToList implements MyList {

    public ArrayList<String> arrayToList;;

    public ArrayToList() {
        arrayToList = new ArrayList<String>();
    }

    @Override
    public void convert(String[] a) {
        for (int i = 0; i < a.length; ++i) {
            arrayToList.add(a[i]);
            System.out.println("I have added the string: " + arrayToList.get(i) + " at the index: " + i);
        }
    }

    @Override
    public void replace(int idx) {
        System.out.println("I have replaced the string: " + arrayToList.get(idx) + " with a null string");
        arrayToList.set(idx, " ");
    }

    @Override
    public ArrayList<String> compact() {
        for (int i = 0; i < arrayToList.size(); ++i) {
            if (arrayToList.get(i).equals("")) {
                arrayToList.remove(i);
            }
        }
        return arrayToList;
    }
}

class ListInheritenceMain {

    public static void main(String[] args){


//        Scanner sc = new Scanner(System.in);
        Random rand = new Random(System.currentTimeMillis());

//        int n = Integer.parseInt(sc.nextLine());
        int n = 6;
        String[] a = new String[n];

//        for(int i = 0; i < n; i++)
//            a[i] = sc.nextLine();
        a[0] = "gurkan";
        a[1] = "elif";
        a[2] = "orc";
        a[3] = "elf";
        a[4] = "horde";
        a[5] = "warlock";
        MyList obj = new ArrayToList();

        obj.convert(a);
        int x = rand.nextInt(n);
        System.out.println(x);
        for(int i = 0; i < x; i++)
            obj.replace(rand.nextInt(n));


        ArrayList<String> s = obj.compact();

        for (int i = 0; i < s.size(); i++){
            if(s.get(i).charAt(0) >= 97 && s.get(i).charAt(0) <= 122){
                try{
                    throw new InvalidStringException("This is an invalid string");
                }
                catch(InvalidStringException e){System.out.println(e.getMessage());}
            }
        }


    }
}