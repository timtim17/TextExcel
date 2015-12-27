package me.timtim17.dev.java.apcs.textexcel;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Scanner;

import me.timtim17.dev.java.apcs.textexcel.Commands.*;

public class TextExcel {
    private static boolean done;

    public static void main(String[] args) throws Exception {
        Table table = getNewTable(5, 5);
        mainLoop(table);
    }

    @NotNull
    public static Table getNewTable(int rows, int cols) {
        return new Table(rows, cols);
    }

    private static void printLogo() {
        // TODO: ASCII ART
        System.out.println("TextExcel\n");
    }

    private static void printCommands(ArrayList<Command> commands) {
        commands.forEach(Command::printCommandListing);
    }

    public static void mainLoop(@NotNull Table table) {
        printLogo();
        table.print();

        Scanner console = new Scanner(System.in);
        ArrayList<Command> commands = Commands.getCommands(table);
        done = false;
        while (!done) {
            System.out.println("Please enter a command:");
            printCommands(commands);
            String requestedCommand = console.nextLine();
            boolean foundCommand = false;
            for (Command command : commands) {
                if (command.getName().equals(requestedCommand)) {
                    command.runCommand();
                    foundCommand = true;
                }
            }
            if (!foundCommand) System.err.println("INVALID COMMAND\n");
        }
        System.out.println("Goodbye.");
    }

    @Deprecated
    public static void print(@NotNull Table table) {
        table.print();
    }

    public static void quit() {
        done = true;
    }
}
