package com.gtxc.practice.thread;

/*
    Created by gt at 7:18 PM on Saturday, February 26, 2022.
    Project: practice, Package: com.gtxc.practice.thread.
*/

public class CounterThread extends Thread {

    private int counter = 0;

    @Override
    public void run() {

//        synchronized (this) {
            // write any race condition sacrificial here

//            for (int i = 0; i < 10; ++i) {
                System.out.println(Thread.currentThread().getName() + "-" + counter);
//                System.out.print(i % 10 == 0 ? "\n" : "");
                ++counter;
//            }

//        }
    }
}
