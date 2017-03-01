package com.bvan.oop.lesson11.mulithreading;

/**
 * @author bvanchuhov
 */
public class ThreadUtils {

    private ThreadUtils() {}

    public static void println(String message) {
        System.out.println(Thread.currentThread() + ": " + message);
    }
}
