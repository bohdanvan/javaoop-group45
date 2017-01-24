package com.bvan.oop.lesson1;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class ArrayListSample {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        System.out.println(list);
    }
}
