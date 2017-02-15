package com.bvan.oop.lesson7.generics.parser;

/**
 * @author bvanchuhov
 */
public class IntegerParser implements Parser<Integer> {

    @Override
    public Integer parse(String s) throws IllegalFormatException {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            throw new IllegalFormatException("can't parse to int: " + s, e);
        }
    }
}
