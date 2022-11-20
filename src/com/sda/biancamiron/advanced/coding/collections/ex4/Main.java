package com.sda.biancamiron.advanced.coding.collections.ex4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Write a program which creates a concordance of characters occurring in a string (i.e., which characters occur where in a string).
 * Read the string from the command line.
 * Ex: {d=[9], o=[4, 6], r=[7], W=[5], H=[0], l=[2, 3, 8], e=[1]}
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(getCharactersPositions("HelloWorld"));

    }

    public static Map<Character, List<Integer>> getCharactersPositions(String input) {
        Map<Character, List<Integer>> positionsByChar = new HashMap<>();
//        input.toCharArray();                                            //iti da array cu caracterele ABC -> ['a','b','c']
        for (int i = 0; i < input.toCharArray().length; i++) {
            char currentChar = input.toCharArray()[i];
            if (positionsByChar.containsKey(currentChar)) {
                List<Integer> positionsOfChar = positionsByChar.get(currentChar);
                positionsOfChar.add(i);
                positionsByChar.put(currentChar, positionsOfChar);
            } else {
                List<Integer> positionsOfChar = new ArrayList<>();
                positionsOfChar.add(i);
                positionsByChar.put(currentChar, positionsOfChar);
            }
        }


        return positionsByChar;
    }
}
