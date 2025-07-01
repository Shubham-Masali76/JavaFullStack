// Find and Replace Words in a File: Implement a program that reads a text file using FileReader, replaces all occurrences of a given word with another word, and writes the updated content to a new file using FileWriter. 

import java.io.*;

public class FindAndReplace {

    public void replaceWords(String inputPath, String outputPath, String target, String replacement) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.replaceAll(target, replacement));
                writer.newLine();
            }
            System.out.println("Word replacement done.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new FindAndReplace().replaceWords("input.txt", "updated.txt", "bug", "feature");
    }
}
