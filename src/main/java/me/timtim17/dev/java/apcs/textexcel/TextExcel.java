package me.timtim17.dev.java.apcs.textexcel;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class TextExcel {
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

    private static void printCommands() {
//        System.out.println("");
    }

    public static void mainLoop(@NotNull Table table) {
        printLogo();
        table.print();

        Scanner console = new Scanner(System.in);
        boolean done = false;
        while (!done) {
            System.out.println("Please enter a command:");
            printCommands();
            String command = console.nextLine();
            // TODO: Do Something With This
        }
    }

    @Deprecated
    public static void print(@NotNull Table table) {
        table.print();
    }
}
