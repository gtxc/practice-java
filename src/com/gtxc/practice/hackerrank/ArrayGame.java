package com.gtxc.practice.hackerrank;

/*
    Created by gt at 3:36 AM on Monday, February 14, 2022.
    Project: practice, Package: com.gtxc.practice.hackerrank.
*/

import java.util.Arrays;
import java.util.Scanner;

public class ArrayGame {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.

//        return recursiveApproach(leap, game, 0);

        int[] cumsum = new int[game.length + 1];
        cumsum[0] = 0;

        for (int i = 0; i < game.length; ++i) {
            if (game[i] == 0) {
                continue;
            }
            cumsum[i+1] += cumsum[i] + game[i];
        }

        int cumsummax = Arrays.stream(cumsum).max().getAsInt();

        if (leap <= cumsummax && cumsummax > 0) {
            return false;
        }

        int n = 0;
        while (true) {
            if (n >= game.length || n+leap >= game.length || n+1 >= game.length) {
                return true;
            }
            if (n < 0 || game[n] == 1) {
                return false;
            }
            game[n] = 1;
            if (n+1 < game.length && game[n+1] == 0) {
                ++n;
            } else if (n-1 > 0 && game[n-1] == 0) {
                --n;
            } else if (n+leap < game.length && game[n+leap] == 0) {
                n += leap;
            }
        }
    }

    private static boolean recursiveApproach(int leap, int[] game, int i) {
        if (i >= game.length) {
            return true;
        }
        if (i < 0 || game[i] == 1) {
            return false;
        }
        game[i] = 1;
        return recursiveApproach(leap, game, i+1) ||
               recursiveApproach(leap, game, i-1) ||
               recursiveApproach(leap, game, i+leap);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
