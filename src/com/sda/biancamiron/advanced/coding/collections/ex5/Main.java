package com.sda.biancamiron.advanced.coding.collections.ex5;

/**
 * Create a Storage class that will have a private Map field, a public constructor, and methods:
 * addToStorage(String key, String value)→ adding elements to the storage
 * printValues(String key)→ displaying all elements under a given key
 * findValues(String value)→ displaying all keys that have a given value
 * The Storage class should allow you to store multiple values under one key.
 */

public class Main {
    public static void main(String[] args) {
        Storage studentsStorage = new Storage();
        studentsStorage.addToStorage("RO45","Andrei");
        studentsStorage.addToStorage("RO45","Alex");
        studentsStorage.addToStorage("RO45","Ema");
        studentsStorage.addToStorage("RO45","Ana");
        studentsStorage.addToStorage("RO46","Andrei");
        studentsStorage.addToStorage("RO46","Matei");
        studentsStorage.addToStorage("RO46","Ion");
        studentsStorage.addToStorage("RO46","Vlad");

        studentsStorage.printValues("RO45");
        studentsStorage.printValues("RO46");
        studentsStorage.printValues("RO47");

        System.out.println(studentsStorage.findKeys("Andrei"));
        System.out.println(studentsStorage.findKeys("Matei"));
        System.out.println(studentsStorage.findKeys("Bogdan"));

    }

}
