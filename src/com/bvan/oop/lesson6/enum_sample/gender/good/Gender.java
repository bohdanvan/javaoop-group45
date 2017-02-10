package com.bvan.oop.lesson6.enum_sample.gender.good;

/**
 * @author bvanchuhov
 */
public enum Gender {
    MALE("This is a male"),
    FEMALE("This is a female"),
    UNDEFINED("This is an undefined");

    private final String description;

    Gender(String description) {
        this.description = description;
    }

    public String getShortName() {
        return name().substring(0, 1);
    }

    public String getDescription() {
        return description;
    }
}
