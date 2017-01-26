package com.bvan.oop.lesson2.dog;

/**
 * @author bvanchuhov
 */
public class DogRunner {

    public static void main(String[] args) {
        Dog dog = new Dog("Rex", "John");
        dog.bark(3);

        System.out.println(dog);
    }
}
