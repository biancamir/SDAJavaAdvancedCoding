package com.sda.biancamiron.advanced.coding.collections.ex9;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Create a Zoo class that will have a collection of animals and will allow you to receive statistics about your animals:
 *  int getNumberOfAllAnimals() → returns the number of all animals Map
 * getAnimalsCount() → returns the number of animals of each species Map
 * void addAnimals(String, int) → adds n animals of a given species
 */

public class Zoo {
   private final Map<String,Integer> animals = new HashMap<>();

   public int getNumbersOfAllAnimals(){
       return animals.values().stream()
               .collect(Collectors.summingInt(numbersOfAnimals->numbersOfAnimals));
   }
   public Map<String,Integer> getAnimalsCount(){
       return new HashMap<>(animals);
   }
   public void addAnimals(String animal, int count){
       if(animals.containsKey(animal)){
           animals.put(animal,animals.get(animal)+count);
       }else{
           animals.put(animal,count);
       }
   }
}
