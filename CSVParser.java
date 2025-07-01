// Custom CSV Parser: Create a program that reads a CSV file using BufferedReader, processes each line to extract values (handling quoted strings properly), and writes a formatted output using BufferedWriter. 


import java.io.*;
import java.util.*;

public class CSVParser {

    public void parseCSV(String inputPath, String outputPath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                List<String> values = parseCSVLine(line);
                writer.write(String.join(" | ", values));
                writer.newLine();
            }
            System.out.println("CSV parsed and written.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<String> parseCSVLine(String line) {
        List<String> result = new ArrayList<>();
        boolean inQuotes = false;
        StringBuilder sb = new StringBuilder();

        for (char ch : line.toCharArray()) {
            if (ch == '"') {
                inQuotes = !inQuotes;
            } else if (ch == ',' && !inQuotes) {
                result.add(sb.toString().trim());
                sb.setLength(0);
            } else {
                sb.append(ch);
            }
        }
        result.add(sb.toString().trim());
        return result;
    }

    public static void main(String[] args) {
        new CSVParser().parseCSV("input.csv", "parsed_output.txt");
    }
}
