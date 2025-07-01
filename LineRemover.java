// Create method to remove specific lines from file,method signature as per follows --> private static void removeLine(filePath,1,5,7); // 1,5,7 lines remove from file 

import java.io.*;
import java.util.*;

public class LineRemover {

    private static void removeLine(String filePath, int... linesToRemove) {
        Set<Integer> linesSet = new HashSet<>();
        for (int line : linesToRemove) linesSet.add(line);

        File inputFile = new File(filePath);
        File tempFile = new File("temp_" + inputFile.getName());

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String currentLine;
            int lineNumber = 1;

            while ((currentLine = reader.readLine()) != null) {
                if (!linesSet.contains(lineNumber)) {
                    writer.write(currentLine);
                    writer.newLine();
                }
                lineNumber++;
            }

            if (!inputFile.delete() || !tempFile.renameTo(inputFile)) {
                System.err.println("Error updating file.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        removeLine("data.txt", 1, 5, 7); // example usage
    }
}
