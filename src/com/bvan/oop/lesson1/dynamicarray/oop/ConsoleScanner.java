package com.bvan.oop.lesson1.dynamicarray.oop;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class ConsoleScanner {

    private Scanner scanner = new Scanner(System.in);

    public int readInt() {
        System.out.print(">> ");
        while (!scanner.hasNextInt()) {
            scanner.next(); // idle

            System.out.println("Illegal number");
            System.out.print(">> ");
        }
        return scanner.nextInt();
    }
}
