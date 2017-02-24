package com.bvan.oop.lesson10;

import java.io.PrintWriter;

/**
 * @author bvanchuhov
 */
public class BufferingSample {

    public static void main(String[] args) {
        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.println("Hello");
        printWriter.flush();
    }
}
