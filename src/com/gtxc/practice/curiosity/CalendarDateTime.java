package com.gtxc.practice.curiosity;

/*
    Created by gt at 10:19 PM on Sunday, April 10, 2022.
    Project: practice, Package: com.gtxc.practice.curiosity.
*/

import java.text.SimpleDateFormat;
import java.util.*;

public class CalendarDateTime {

    public static void main(String[] args) {
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
