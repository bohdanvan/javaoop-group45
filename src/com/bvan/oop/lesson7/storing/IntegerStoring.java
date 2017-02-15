package com.bvan.oop.lesson7.storing;

/**
 * @author bvanchuhov
 */
public class IntegerStoring {

    public static void main(String[] args) {
        int x = 100;
        x = add10(x);
        System.out.println(x);
    }

    private static int add10(int x) {
        x += 10; // bad code, better: return x + 10
        return x;
    }
}
