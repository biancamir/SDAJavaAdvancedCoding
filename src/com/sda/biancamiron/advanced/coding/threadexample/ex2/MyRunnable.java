package com.sda.biancamiron.advanced.coding.threadexample.ex2;

/**
 * Create a class implementing Runnable, e.g. MyRunnable.
 * Implement the run() method, which will display the name of the current thread in the same way as in the previous exercise.
 */

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
