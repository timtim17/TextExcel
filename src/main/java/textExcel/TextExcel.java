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
            String command = in.nextLine().toLowerCase();
            switch (command) {
                case "quit":
                    done = true;
                    break;
                default:
                    System.out.println(spreadsheet.processCommand(command));
                    System.err.println("Invalid command.");
            }
        }
    }
}
