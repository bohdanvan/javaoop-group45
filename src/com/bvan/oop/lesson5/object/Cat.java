package com.bvan.oop.lesson5.object;

/**
 * @author bvanchuhov
 */
public class Cat {

    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("Meow-meow: " + name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        return name != null ? name.equals(cat.name) : cat.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
