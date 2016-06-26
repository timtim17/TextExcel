package textExcel;

import java.util.Scanner;

// Update this file with your own code.
public class TextExcel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Spreadsheet spreadsheet = new Spreadsheet();
        boolean done = false;
        while (!done) {
            System.out.print("Enter a command >>> ");
            String command = in.nextLine();
            String commandLower = command.toLowerCase();
            if (commandLower.equals("quit")) done = true;
            else {
                String output = spreadsheet.processCommand(command);
                if (output == null) {
                    System.err.println("Invalid command.");
                    try {
                        Thread.sleep(1000); // System.err has a noticeable delay, wait for the output to catch up
                    } catch (InterruptedException ignored) {}
                }
                else System.out.println(output);
            }
        }
    }
}
