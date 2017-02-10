package com.bvan.oop.lesson6.enum_sample.gender.bad;

/**
 * @author bvanchuhov
 */
public class BadUserRunner {

    public static void main(String[] args) {
        BadUser john = new BadUser("John", 25, BadUser.MALE);
        System.out.println(john);
    }
}
