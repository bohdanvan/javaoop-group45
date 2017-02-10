package com.bvan.oop.lesson6.enum_sample.gender.good;

/**
 * @author bvanchuhov
 */
public class User {

    private final String name;
    private final int age;
    private final Gender gender;

    public User(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender.toString() +
                '}';
    }
}
