package com.bvan.oop.lesson7.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class ListSample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        int x = list.get(1);
        System.out.println("x = " + x);

        System.out.println(list);
    }
}
