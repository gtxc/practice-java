package com.gtxc.practice.hackerrank;

/*
    Created by gt at 2:00 PM on Wednesday, February 16, 2022.
    Project: practice, Package: com.gtxc.practice.hackerrank.
*/

import com.gtxc.practice.akb.Account;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GetDeclaredMethodsMain {
    public static void main(String[] args) {

        // this is proper way
//        Class<Account> account = Account.class;
        // this is way how hackerrank gave
        Class account = Account.class;
        Method[] methods = account.getDeclaredMethods();

        List<String> methodNames = new ArrayList<>();
        for (Method m : methods) {
            methodNames.add(m.getName());
        }
        Collections.sort(methodNames);
        for (String name : methodNames) {
            System.out.println(name);
        }
    }
}
