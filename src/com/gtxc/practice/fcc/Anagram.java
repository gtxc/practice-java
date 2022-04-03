package com.gtxc.practice.fcc;

/*
    Created by gt at 11:18 PM on Sunday, April 03, 2022.
    Project: practice, Package: com.gtxc.practice.fcc.
*/

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static void main(String[] args) {
        System.out.println(checkAnagram("salesmen", "nameless"));
        System.out.println(checkAnagram("danger", "garden"));
    }

    static boolean checkAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        Map<Character, Integer> s1hm = new HashMap<>();
        Map<Character, Integer> s2hm = new HashMap<>();
        for (int i = 0; i < s1.length(); ++i) {
            addToMap(s1hm, s1.charAt(i));
            addToMap(s2hm, s2.charAt(i));
        }
        System.out.println(s1hm);
        System.out.println(s2hm);
        return s1hm.equals(s2hm);
    }

    static void addToMap(Map<Character, Integer> m, Character c) {
        if (m.containsKey(c)) {
            m.replace(c, m.get(c) + 1);
        } else {
            m.put(c, 1);
        }
    }
}
