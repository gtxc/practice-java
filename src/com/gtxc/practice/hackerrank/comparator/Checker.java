package com.gtxc.practice.hackerrank.comparator;

/*
    Created by gt at 3:46 PM on Monday, February 07, 2022.
    Project: practice, Package: comparator.
*/

import java.util.Comparator;

public class Checker implements Comparator<Player> {
    @Override
    public int compare(Player p1, Player p2) {
        if (p1.score < p2.score) {
            return 1;
        } else if (p1.score > p2.score) {
            return -1;
        } else {
            for (int i = 0; i < p1.name.length(); i++) {
                if (p1.name.charAt(i) < p2.name.charAt(i)) {
                    return -1;
                } else if (p1.name.charAt(i) > p2.name.charAt(i)) {
                    return 1;
                }
            }
            return 0;
        }
    }
}
