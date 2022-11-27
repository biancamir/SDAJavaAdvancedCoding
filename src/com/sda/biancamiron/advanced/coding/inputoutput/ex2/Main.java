package com.sda.biancamiron.advanced.coding.inputoutput.ex2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Write a program that will count the occurrences of each word in a text file
 * and then save the results in the form of a table in a new file.
 * Pasii pe care tr sa ii urmam:
 * 1. Read all line from file
 * 2. Spargem fiecare linie in cuvinte ( Split each line in words)
 * 3. Create a Map with number of occurances (spatii) for each word
 * 4. Write result in a new file
 */

public class Main {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("C:\\Users\\Bi\\Documents\\SDAJavaAdvancedCoding\\resources\\ex2.txt");
        if (Files.isDirectory(filePath)) {
            System.err.println("Given path it is not a File, it is a Directory");
            return;
        }
        if (!Files.exists(filePath)) {
            System.out.println("The file doesn't exist");
            return;
        }
        List<String> originalFileContent = Files.readAllLines(filePath);

        Map<String, Integer> numberOfOccurrences = new HashMap<>();
        for (String line : originalFileContent) {
            for (String word : line.split(" ")) {
                if (numberOfOccurrences.containsKey(word)) {
                    numberOfOccurrences.put(word, numberOfOccurrences.get(word) + 1);
                } else {
                    numberOfOccurrences.put(word, 1);
                }

            }

        }
        System.out.println(numberOfOccurrences);

        Path writeFilePath = Paths.get("C:\\Users\\Bi\\Documents\\SDAJavaAdvancedCoding\\resources\\ex2_result.txt");
        List<String> newFileContent = new ArrayList<>();
        newFileContent.add("Word                         Number of occurrences");
        for (Map.Entry<String, Integer> entry : numberOfOccurrences.entrySet()) {
            newFileContent.add(entry.getKey()+String.format("%1$"+(30-entry.getKey().length())+"s",entry.getValue()));

        }
        Files.write(writeFilePath,newFileContent);


    }
}
