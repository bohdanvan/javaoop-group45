package com.bvan.oop.lesson4.inheritance;

/**
 * @author bvanchuhov
 */
public class Inheritance {
    public static void main(String[] args) {
        Person person = new Developer("John", "Middle");
        person.howAreYou();
        System.out.println(person.getName());
    }
}

