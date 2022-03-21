package com.gtxc.practice.hackerrank;

/*
    Created by gt at 4:15 PM on Wednesday, February 09, 2022.
    Project: practice, Package: com.gtxc.practice.hackerrank.
*/

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class PrintGivenDayOfDate {

    public static void main(String[] args) {
        int month = 8;
        int day = 5;
        int year = 2015;

        Calendar calendar = new GregorianCalendar(year, month-1, day);
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        System.out.println(sdf.format(calendar.getTime()).toUpperCase());
    }
}
