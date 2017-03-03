package com.bvan.oop.lesson12.multithreading.creation;

import com.bvan.oop.lesson11.mulithreading.ThreadUtils;

/**
 * @author bvanchuhov
 */
public class ThreadCreationWithAnonimousClass {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                doSmth();
            }
        }).start();

        ThreadUtils.println("Goodbye");
    }

    private static void doSmth() {
        ThreadUtils.println("Hello");
    }
}
