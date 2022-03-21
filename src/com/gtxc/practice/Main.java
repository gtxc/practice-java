package com.gtxc.practice;

import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Calendar calendar = new GregorianCalendar(2015, 7, 5);
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        System.out.println(sdf.format(calendar.getTime()).toUpperCase());

        List<List<Integer>> a = new ArrayList<>();
        ArrayList<Integer> asd = new ArrayList<>();
        asd.ensureCapacity(1);
        LinkedList<Integer> assd = new LinkedList<>();
        assd.addFirst(1);
    }
}