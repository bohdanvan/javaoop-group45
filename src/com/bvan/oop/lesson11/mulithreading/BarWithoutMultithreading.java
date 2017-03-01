package com.bvan.oop.lesson11.mulithreading;

/**
 * @author bvanchuhov
 */
public class BarWithoutMultithreading {

    public static void main(String[] args) {
        for (int drinker = 0; drinker < 5; drinker++) {
            new Drinker().run();
        }

        ThreadUtils.println("Bar is closed");
    }
}
