package com.bvan.oop.lesson11.mulithreading;

/**
 * @author bvanchuhov
 */
public class Drinker implements Runnable {

    private static int nextId = 0;
    private final int id = nextId++;

    @Override
    public void run() {
        ThreadUtils.println("Hello. " + drinkerInfo());

        for (int beer = 0; beer < 5; beer++) {
            ThreadUtils.println(drinkerInfo() + "I'm drinking " + beer + " beer");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        ThreadUtils.println("Goodbye. " + drinkerInfo());
    }

    private String drinkerInfo() {
        return "I'm " + id + " drinker. ";
    }
}
