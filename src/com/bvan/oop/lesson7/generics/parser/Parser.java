package com.bvan.oop.lesson7.generics.parser;

/**
 * @author bvanchuhov
 */
public interface Parser<T> {

    T parse(String s) throws IllegalFormatException;
}
