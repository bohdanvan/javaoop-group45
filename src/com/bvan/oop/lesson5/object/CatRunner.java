package com.bvan.oop.lesson5.object;

/**
 * @author bvanchuhov
 */
public class CatRunner {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Murzik");
        Cat cat2 = new Cat("Murzik");

        System.out.println(cat1 == cat2); // false
        System.out.println(cat1.equals(cat2)); // true
        System.out.println(cat1);
    }
}
