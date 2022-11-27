package com.sda.biancamiron.advanced.coding.oop.ex8;

import java.util.List;

/**
 * GENERICS
 * Design the Joiner class, which in the constructor will take a separator (string)
 * and have a join() method that allows you to specify any number of T-type objects.
 * This method will return a string joining all passed elements by calling their toString() method
 * and separating them with a separator. eg. for Integers and separator "-" it should return: 1-2-3-4
 */

public class Joiner<T> {
    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(List<T> elements) {
        String result = "";
        for (int i = 0; i < elements.size(); i++) {
            result = result + elements.get(i).toString();
            if (i != elements.size() - 1) {
                result = result + separator;         //if ul este pt ultima pozitie unde nu mai tr sa add "-"
            }
        }
        return result;
    }
}
