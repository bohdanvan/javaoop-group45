package com.bvan.oop.lesson11.mulithreading;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class BarWithWaiting {

    public static void main(String[] args) throws InterruptedException {
        List<Thread> drinkerThreads = new ArrayList<>();

        for (int drinker = 0; drinker < 5; drinker++) {
            Thread drinkerThread = new Thread(new Drinker());
            drinkerThreads.add(drinkerThread);
        }

        startAll(drinkerThreads);
        joinAll(drinkerThreads);

        ThreadUtils.println("Bar is closed");
    }
    private static void startAll(List<Thread> drinkerThreads) {
        for (Thread drinkerThread : drinkerThreads) {
            drinkerThread.start();
        }
    }
    private static void joinAll(List<Thread> drinkerThreads) throws InterruptedException {
        for (Thread drinkerThread : drinkerThreads) {
            drinkerThread.join();
        }
    }
}

