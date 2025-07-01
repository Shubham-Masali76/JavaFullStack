// Logging User Input to a File: Capture user inputs from System.in continuously and log them to a file using PrintWriter. Include timestamps for each input. 

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserInputLogger {

    public void startLogging(String logFilePath) {
        try (Scanner scanner = new Scanner(System.in);
             PrintWriter writer = new PrintWriter(new FileWriter(logFilePath, true))) {

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            System.out.println("Enter text to log (type 'exit' to quit):");
            while (true) {
                String input = scanner.nextLine();
                if ("exit".equalsIgnoreCase(input)) break;

                String timestamp = LocalDateTime.now().format(formatter);
                writer.println("[" + timestamp + "] " + input);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new UserInputLogger().startLogging("user_log.txt");
    }
}
