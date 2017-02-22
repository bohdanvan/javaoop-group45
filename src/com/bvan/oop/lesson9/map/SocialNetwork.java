package com.bvan.oop.lesson9.map;

import com.bvan.oop.common.Person;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author bvanchuhov
 */
public class SocialNetwork {

    public static void main(String[] args) {
        Map<Long, Person> idToPersonMap = new HashMap<>();

        idToPersonMap.put(10L, new Person("John", 25));
        idToPersonMap.put(200L, new Person("Phil", 20));
        idToPersonMap.put(100L, new Person("Bob", 30));
        idToPersonMap.put(1L, null);

        idToPersonMap.put(200L, new Person("Alex", 35));

        System.out.println(idToPersonMap.get(100L));
        System.out.println(idToPersonMap.get(200L));
        System.out.println();

        System.out.println(idToPersonMap.get(1L));
        System.out.println(idToPersonMap.containsKey(1L));
        System.out.println();

        System.out.println(idToPersonMap.get(1000L));
        System.out.println(idToPersonMap.containsKey(1000L));
        System.out.println();

        printKeys(idToPersonMap);
        printValues(idToPersonMap);
        printEntries(idToPersonMap);
    }

    private static void printKeys(Map<Long, Person> idToPersonMap) {
        System.out.println("Keys:");
        Set<Long> keys = idToPersonMap.keySet();
        for (Long key : keys) {
            System.out.println(key);
        }
        System.out.println();
    }

    private static void printValues(Map<Long, Person> idToPersonMap) {
        System.out.println("Values:");
        Collection<Person> values = idToPersonMap.values();
        for (Person value : values) {
            System.out.println(value);
        }
        System.out.println();
    }

    private static void printEntries(Map<Long, Person> idToPersonMap) {
        System.out.println("Entries:");
        Set<Map.Entry<Long, Person>> entries = idToPersonMap.entrySet();
        for (Map.Entry<Long, Person> entry : entries) {
            System.out.println(entry);
        }
    }
}
