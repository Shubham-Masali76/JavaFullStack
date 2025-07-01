// Write a local class to get second line from a file and save it to another file (use lambda and multithreading)

import java.io.*;

public class FileLineProcessor {

    public void extractSecondLine(String inputFile, String outputFile) {
        class LineReader implements Runnable {
            @Override
            public void run() {
                try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
                     BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
                     
                    br.readLine(); // Skip first line
                    String secondLine = br.readLine();
                    if (secondLine != null) {
                        bw.write(secondLine);
                        System.out.println("Second line written to file: " + secondLine);
                    } else {
                        System.out.println("No second line found.");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        Thread thread = new Thread(new LineReader());
        thread.start();
    }

    public static void main(String[] args) {
        FileLineProcessor processor = new FileLineProcessor();
        processor.extractSecondLine("input.txt", "output.txt");
    }
}
