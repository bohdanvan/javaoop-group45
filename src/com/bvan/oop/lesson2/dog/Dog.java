package com.bvan.oop.lesson2.dog;

/**
 * @author bvanchuhov
 */
public class Dog {

    private final String name;
    private final String ownerName;

    public Dog(String name, String ownerName) {
        this.name = name;
        this.ownerName = ownerName;
    }

    public void bark() {
        System.out.println("Bark");
    }

    public void bark(int count) {
        if (count < 0) {
            throw new IllegalArgumentException("negative count: " + count);
        }

        for (int i = 0; i < count; i++) {
            bark();
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
