package com.sda.biancamiron.advanced.coding.collections.ex9;

/**
 * Create a Zoo class that will have a collection of animals and will allow you to receive statistics about your animals:
 *  int getNumberOfAllAnimals() → returns the number of all animals Map
 * getAnimalsCount() → returns the number of animals of each species Map
 * void addAnimals(String, int) → adds n animals of a given species
 */

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimals("girafa",10);
        zoo.addAnimals("cal",2);
        zoo.addAnimals("leu",15);
        zoo.addAnimals("leu",2);
        zoo.addAnimals("maimuta",2);

        System.out.println(zoo.getAnimalsCount());
        System.out.println(zoo.getNumbersOfAllAnimals());
    }
}
