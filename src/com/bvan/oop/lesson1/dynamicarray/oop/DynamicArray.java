package com.bvan.oop.lesson1.dynamicarray.oop;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * @author bvanchuhov
 */
public class DynamicArray {

    private static final int INITIAL_CAPACITY = 10;
    private static final int GROWTH_FACTOR = 2;

    private int[] elems = new int[INITIAL_CAPACITY];
    private int size = 0;

    public void addLast(int n) {
        if (elems.length == size) {
            elems = Arrays.copyOf(elems, elems.length * GROWTH_FACTOR);
        }
        elems[size++] = n;
    }

    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < size; i++) {
            stringJoiner.add(String.valueOf(elems[i]));
        }
        return stringJoiner.toString();
    }
}
