// Reverse Content of a Large File: Read a large text file using BufferedReader, reverse the content line by line, and write it to another file using BufferedWriter without loading the entire file into memory. 

import java.io.*;

public class FileReverser {

    public void reverseFileLineByLine(String inputPath, String outputPath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(new StringBuilder(line).reverse().toString());
                writer.newLine();
            }
            System.out.println("File reversed line by line.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new FileReverser().reverseFileLineByLine("large_input.txt", "reversed_output.txt");
    }
}
