package com.bvan.oop.lesson6.exception.unchecked;

/**
 * @author bvanchuhov
 */
public class ArrayIndexOfBoundsSample {

    public static void main(String[] args) {
        System.out.println("Hello".charAt(100));

        int[] array = new int[10];
        System.out.println(array[100]);
    }
}
