package com.gtxc.practice.hackerrank;

/*
    Created by gt at 1:25 PM on Wednesday, February 16, 2022.
    Project: practice, Package: com.gtxc.practice.hackerrank.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class VarArgs {

    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            int n6=Integer.parseInt(br.readLine());
            Add ob=new Add();
            ob.add(n1,n2);
            ob.add(n1,n2,n3);
            ob.add(n1,n2,n3,n4,n5);
            ob.add(n1,n2,n3,n4,n5,n6);
            Method[] methods=Add.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++)
            {
                if(set.contains(methods[i].getName()))
                {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

class Add {
    public void add(int n1, int n2, int... n) {
        if (n.length == 0) {
            System.out.println(n1 + "+" + n2 + "=" + (n1+n2));
        } else {
            int sum = n1 + n2;
            for (int i : n) {
                sum += i;
            }
            System.out.print(n1 + "+" + n2 + "+");
            for (int i = 0; i < n.length-1; ++i) {
                System.out.print(n[i] + "+");
            }
            System.out.println(n[n.length-1] + "=" + sum);
        }
    }
}
