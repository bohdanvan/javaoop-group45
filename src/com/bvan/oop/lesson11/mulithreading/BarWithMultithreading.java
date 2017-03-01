package com.bvan.oop.lesson11.mulithreading;

import static com.bvan.oop.lesson11.mulithreading.ThreadUtils.println;

/**
 * @author bvanchuhov
 */
public class BarWithMultithreading {

    public static void main(String[] args) throws InterruptedException {
        for (int id = 0; id < 5; id++) {
            Thread drinkerThread = new Thread(new Drinker());
            drinkerThread.start();
        }

        println("Bar is closed");
    }
}
