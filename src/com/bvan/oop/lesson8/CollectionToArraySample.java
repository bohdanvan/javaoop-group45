package com.bvan.oop.lesson8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class CollectionToArraySample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Bob", "Phil");

        Object[] objectsArray = names.toArray();
        String[] stringsArray = names.toArray(new String[0]);

        System.out.println("objectsArray = " + Arrays.toString(objectsArray));
        System.out.println("stringsArray = " + Arrays.toString(objectsArray));
    }
}
