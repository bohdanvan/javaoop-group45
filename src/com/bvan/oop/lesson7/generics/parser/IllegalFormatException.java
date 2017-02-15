package com.bvan.oop.lesson7.generics.parser;

/**
 * @author bvanchuhov
 */
public class IllegalFormatException extends Exception {

    public IllegalFormatException() {
    }

    public IllegalFormatException(String message) {
        super(message);
    }

    public IllegalFormatException(String message, Throwable cause) {
        super(message, cause);
    }
}
