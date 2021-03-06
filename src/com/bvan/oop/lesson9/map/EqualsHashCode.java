package com.bvan.oop.lesson9.map;

import java.util.Objects;

/**
 * @author bvanchuhov
 */
public class EqualsHashCode {

    public static void main(String[] args) {
        A x = new A(10);
        A y = new A(10);
        A z = new A(20);

        System.out.println("Equals:");
        System.out.println(x.equals(x)); // true
        System.out.println(x.equals(y)); // true
        System.out.println(y.equals(x)); // true
        System.out.println(x.equals(z)); // false
//        System.out.println(Objects.equals(x, y));
        System.out.println();

        System.out.println("Hash Code:");
        System.out.println(x.hashCode() == x.hashCode()); // true
        System.out.println(x.hashCode() == y.hashCode()); // true
        System.out.println(x.hashCode() == z.hashCode()); // false, maybe true
    }
}

class A {
    private final int x;
    private String s;

    public A(int x) {
        this.x = x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        A a = (A) o;

        if (x != a.x) return false;
        return s != null ? s.equals(a.s) : a.s == null;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + (s != null ? s.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                '}';
    }
}
