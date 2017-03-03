package com.bvan.oop.lesson12.multithreading.creation;

import com.bvan.oop.lesson11.mulithreading.ThreadUtils;

/**
 * @author bvanchuhov
 */
public class ThreadCreationWithIheritance {

    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();

        ThreadUtils.println("Goodbye");
    }
}

class MyThread extends Thread { // BAD STYLE
    @Override
    public void run() {
        ThreadUtils.println("Hello");
    }
}
