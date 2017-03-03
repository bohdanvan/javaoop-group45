package com.bvan.oop.lesson12.multithreading.creation;

import com.bvan.oop.lesson11.mulithreading.Drinker;
import com.bvan.oop.lesson11.mulithreading.ThreadUtils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author bvanchuhov
 */
public class ExecutorServiceSample {

    public static void main(String[] args) throws InterruptedException {
        startMusic();

        ExecutorService executorService =
                Executors.newCachedThreadPool();

        for (int i = 0; i < 3; i++) {
            executorService.submit(new Drinker());
        }
        executorService.shutdown();

        ThreadUtils.println("Bar is closed");
    }

    private static void startMusic() {
        Thread musicThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    ThreadUtils.println("---- MUSIC ----");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        musicThread.setDaemon(false);
        musicThread.start();
    }
}
