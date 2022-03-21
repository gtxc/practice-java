package com.gtxc.practice.hackerrank.comparator;

/*
    Created by gt at 3:45 PM on Monday, February 07, 2022.
    Project: practice, Package: comparator.
*/

import java.util.Arrays;

public class ComparatorMain {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();

        Player[] player = new Player[5];
        Checker checker = new Checker();

//        for(int i = 0; i < n; i++){
//            player[i] = new Player(scan.next(), scan.nextInt());
//        }
//        scan.close();

        player[0] = new Player("Gurkan", 100);
        player[1] = new Player("Elif", 200);
        player[2] = new Player("Orc", 80);
        player[3] = new Player("Gurkan", 80);
        player[4] = new Player("Elif", 200);

        Player[] player2;
        player2 = player;

        Arrays.sort(player, checker);
        System.out.println("Checker output:");
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
        System.out.println();
        Checker2 checker2 = new Checker2();
        Arrays.sort(player2, checker2);
        System.out.println("Checker2 output:");
        for (Player p : player2) {
            System.out.printf("%s %s\n", p.name, p.score);
        }

    }
}
