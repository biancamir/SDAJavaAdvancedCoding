package com.sda.biancamiron.advanced.coding.collections.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
Create a method that takes a string list as a parameter, then returns that list sorted alphabetically from Z to A case-insensitive.
 */

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Andrei");
        list.add("Stefan");
        list.add("claudiu");
        list.add("maria");
        list.add("teodora");
        System.out.println(orderCaseList(list));
    }
    public static List<String> orderCaseList(List<String> inputList){
        return inputList.stream()
                .sorted((o1,o2)->o2.compareToIgnoreCase(o1))
                .collect(Collectors.toList());
    }
}
