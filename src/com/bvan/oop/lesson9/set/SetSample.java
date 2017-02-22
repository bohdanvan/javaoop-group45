package com.bvan.oop.lesson9.set;

import java.util.*;

/**
 * @author bvanchuhov
 */
public class SetSample {

    public static void main(String[] args) {
        List<Integer> ages = Arrays.asList(
                30, 20, 30, 15, 30, 20, 22
        );

        Set<Integer> uniqueAges = new TreeSet<>();
        for (Integer age : ages) {
            uniqueAges.add(age);
        }
        // or simply: Set<Integer> uniqueAges = new TreeSet<>(ages);

        System.out.println(uniqueAges); // [15, 20, 22, 30]
        System.out.println(uniqueAges.contains(20)); // true
        System.out.println(uniqueAges.contains(50)); // false
    }
}
