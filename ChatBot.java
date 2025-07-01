// Multi-Threaded Console Chat: Create a multi-threaded console-based chat where one thread reads user input and another thread prints simulated chatbot responses. 

import java.util.Scanner;

public class ChatBot {

    public void startChat() {
        Thread userInputThread = new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("You: ");
                String input = scanner.nextLine();
                if ("exit".equalsIgnoreCase(input)) break;
                synchronized (System.out) {
                    System.out.println("Waiting for response...");
                }
            }
            scanner.close();
        });

        Thread botThread = new Thread(() -> {
            try {
                while (true) {
                    Thread.sleep(3000); // simulate delay
                    synchronized (System.out) {
                        System.out.println("Bot: I'm just a simple bot.");
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        userInputThread.start();
        botThread.setDaemon(true); // stop bot when main thread ends
        botThread.start();
    }

    public static void main(String[] args) {
        new ChatBot().startChat();
    }
}
