package com.bvan.oop.lesson4.inheritance;

/**
 * @author bvanchuhov
 */
public class Person {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
        this.name = "unnamed";
    }

    public void howAreYou() {
        System.out.println("I'm fine");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
