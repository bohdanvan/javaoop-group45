package com.bvan.oop.lesson7.wrappers;

/**
 * @author bvanchuhov
 */
public class WrapperFieldSample {

    public static void main(String[] args) {
        System.out.println(new A()); // A{b=null}
    }
}

class A {
    private Boolean b;

    @Override
    public String toString() {
        return "A{" +
                "b=" + b +
                '}';
    }
}
