package com.sda.biancamiron.advanced.coding.oop.ex9;

import java.util.ArrayList;
import java.util.List;

/**
 * Extend the ArrayList class by implementing the getEveryNthElement() method.
 * This method returns a list of elements and takes two parameters:
 * the element index from which it starts and a number specifying which element to choose.
 * For the list: [a, b, c, d, e, f, g] and parameters: startIndex = 2 and skip = 3 it should return [c, g]
 */

public class SdaArrayList<T> extends ArrayList<T> {
    public List<T> getEveryNthElement(int startIndex, int numberOfSkippedElements) {
        List<T> collectorList = new ArrayList<>();
        if (startIndex < 0 || startIndex > size()) {
            throw new IllegalStateException("Invalid start index");
        }
        if (numberOfSkippedElements < 0) {
            throw new IllegalStateException("Invalid number of skipped elements");
        }
        for (int i = startIndex; i < size(); i += numberOfSkippedElements + 1) {
            collectorList.add(get(i));
        }
        return collectorList;
    }
}
