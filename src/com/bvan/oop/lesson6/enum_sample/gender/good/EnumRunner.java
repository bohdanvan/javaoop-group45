package com.bvan.oop.lesson6.enum_sample.gender.good;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class EnumRunner {

    public static void main(String[] args) {
        Gender gender = Gender.UNDEFINED;
        System.out.println("name = " + gender.name());
        System.out.println("ordinal = " + gender.ordinal());
        System.out.println();

        Gender genderByName = Gender.valueOf("male".toUpperCase());
        System.out.println("gender by name = " + genderByName);

        System.out.println("gender values = " + Arrays.toString(Gender.values()));

        Gender genderByIndex = Gender.values()[1];
        System.out.println("gender by index = " + genderByIndex);
    }
}
