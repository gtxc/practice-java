package com.gtxc.practice.hackerrank.comparator;

/*
    Created by gt at 4:11 PM on Monday, February 07, 2022.
    Project: practice, Package: comparator.
*/

import java.util.Comparator;

// a good alternative way
public class Checker2 implements Comparator<Player> {
    @Override
    public int compare(Player p1, Player p2) {
        if (p1.score == p2.score) {
            return p1.name.compareTo(p2.name);
        } else {
            return p2.score - p1.score;
        }
    }
}