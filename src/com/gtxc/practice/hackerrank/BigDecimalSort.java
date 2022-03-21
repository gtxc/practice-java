package com.gtxc.practice.hackerrank;

/*
    Created by gt at 7:10 PM on Sunday, February 13, 2022.
    Project: practice, Package: com.gtxc.practice.hackerrank.
*/

import java.math.BigDecimal;
import java.util.Arrays;

public class BigDecimalSort {

    public static void main(String []args){
        //Input
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int n = 9;
        String[] s = new String[n+2];
        s[0] = "-100";
        s[1] = "50";
        s[2] = "0";
        s[3] = "56.6";
        s[4] = "90";
        s[5] = "0.12";
        s[6] = ".12";
        s[7] = "02.34";
        s[8] = "000.000";


        String[] ss = Arrays.copyOf(s, s.length-2);

        // alternative method to sort
        Arrays.sort(ss, (s1, t1) -> new BigDecimal(t1).compareTo(new BigDecimal(s1)));

        System.out.println(Arrays.toString(ss));

        //        for(int i = 0; i < n; ++i){
//            s[i] = sc.next();
//        }
//        sc.close();

        //Write your code here

        for (int i = 1; i < n; ++i) {
            int j;
            BigDecimal tmp = new BigDecimal(s[i]);
            String tmps = s[i];
            for (j = i-1; j >= 0 && tmp.compareTo(BigDecimal.valueOf(Double.parseDouble(s[j]))) > 0; --j) {
                s[j + 1] = s[j];
            }
            s[j + 1] = tmps;
        }

        //Output
        for(int i = 0; i < n; ++i)
        {
            System.out.println(s[i]);
        }
    }
}
