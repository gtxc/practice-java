package com.gtxc.practice.thread;

/*
    Created by gt at 7:19 PM on Saturday, February 26, 2022.
    Project: practice, Package: com.gtxc.practice.thread.
*/

import java.util.ArrayList;
import java.util.List;

public class ThreadMain {

    public static void main(String[] args) {

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        List<List<Integer>> iArr = new ArrayList<>();

        for (int i = 0; i < 4; ++i) {
            iArr.add(new ArrayList<>());
        }

        for (int i = 1, j = 0; i <= 1e4; ++i) {
            iArr.get(j).add(i);
            if (i % 2500 == 0) {
                ++j;
            }
        }

//        ExecutorService executorService = Executors.newFixedThreadPool(4);

        Object LOCK = new Object();

        for (int i = 0; i < 4; ++i) {
            int finalI = i;
            Runnable checkEvenOdd = () -> {
                for (Integer n : iArr.get(finalI)) {
                    synchronized (LOCK) {
                        if (n % 2 == 0) {
                            even.add(n);
                        } else {
                            odd.add(n);
                        }
                    }
                }
            };
            Thread t = new Thread(checkEvenOdd);
            t.start();
//            try {
//                t.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            executorService.execute(checkEvenOdd);
        }

        System.out.println(Thread.activeCount());

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.activeCount());


//        executorService.shutdown();
//        try {
//            boolean finished = executorService.awaitTermination(1, TimeUnit.MINUTES);
//            System.out.println(finished);
        System.out.println("even: " + even.size());
        System.out.println("odd: " + odd.size());
        //        System.out.println("odd max: " + odd.get(4999));

        System.out.println(odd);
        System.out.println(even);

        int a = 1;
        for (Integer i : even) {
            if (i == null) {
                System.out.println(a++);
            }
        }
        System.out.println();
        for (Integer i : odd) {
            if (i == null) {
                System.out.println(a++);
            }
        }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(Thread.activeCount());

    }
}
