package com.bvan.oop.lesson7.storing;

/**
 * @author bvanchuhov
 */
public class StringBuilderStoring {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        addWorld(sb);
        System.out.println(sb); // Hello, world
    }

    private static void addWorld(StringBuilder sb) {
        sb.append(", world");
    }
}
