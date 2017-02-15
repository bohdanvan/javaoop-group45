package com.bvan.oop.lesson7.sorting;

/**
 * @author bvanchuhov
 */
public class CompareSample {

    public static void main(String[] args) {
        System.out.println("Integer:");
        System.out.println(Integer.compare(10, 20)); // < 0
        System.out.println(Integer.compare(30, 20)); // > 0
        System.out.println(Integer.compare(20, 20)); // 0
        System.out.println();

        System.out.println("String:");
        System.out.println("ABCD".compareTo("AXY")); // < 0
        System.out.println("Home".compareTo("Home")); // 0
        System.out.println("Home".compareTo("Homework")); // < 0
    }
}
