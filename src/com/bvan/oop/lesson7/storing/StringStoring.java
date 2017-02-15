package com.bvan.oop.lesson7.storing;

/**
 * @author bvanchuhov
 */
public class StringStoring {

    public static void main(String[] args) {
        String s = "Hello";
        s = addWorld(s);
        System.out.println(s); // Hello, world
    }

    public static String addWorld(String s) {
        s += ", world"; // bad code, better: return s + ", world"
        return s;
    }
}
