package com.bvan.oop.lesson1;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class StringSample {

    public static void main(String[] args) {
        String s = "Hello";
        int length = s.length(); // OOP code
        System.out.println("length = " + length);

        int[] array = {10, 30, 20};
        Arrays.sort(array); // Procedural code
        System.out.println(Arrays.toString(array));
    }
}
