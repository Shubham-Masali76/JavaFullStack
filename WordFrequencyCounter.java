// Word Frequency Counter in Large File: Read a large text file using BufferedReader and count the frequency of each unique word, ignoring case sensitivity. Store the results in another file.

import java.io.*;
import java.util.*;

public class WordFrequencyCounter {

    public void countWords(String inputPath, String outputPath) {
        Map<String, Integer> freqMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
                for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
                    writer.write(entry.getKey() + ": " + entry.getValue());
                    writer.newLine();
                }
                System.out.println("Word frequencies written.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new WordFrequencyCounter().countWords("large_input.txt", "word_freq.txt");
    }
}
