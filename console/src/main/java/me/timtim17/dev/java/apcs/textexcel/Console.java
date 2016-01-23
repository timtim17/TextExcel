package me.timtim17.dev.java.apcs.textexcel;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Scanner;

import me.timtim17.dev.java.apcs.textexcel.util.Utility;

/**
 * @author Austin Jenchi (timtim17)
 */
public class Console {
  private static boolean done;

  public static void main(String[] args) throws Exception {
    boolean runningFromJar = Utility.isRunningFromJar();
    if (runningFromJar) {
      throw new Exception("TODO: Running from a jar with a GUI");
      // TODO: Run from jar with GUI
      // TODO: Intercept souts
    }
    Table table = Table.getNewTable(5, 5);
    mainLoop(table);
  }

  private static void printLogo() {
    // TODO: ASCII ART
    System.out.println("TextExcel\n");
  }

  private static void mainLoop(@NotNull Table table) {
    printLogo();
    table.print();

    Scanner console = new Scanner(System.in);
    ArrayList<Commands.Command> commands = Commands.getCommands(table);
    done = false;
    while (!done) {
      System.out.println("Please enter a command:");
      printCommands(commands);
      String requestedCommand = console.nextLine();
      boolean foundCommand = false;
      for (Commands.Command command : commands) {
        if (command.getName().equals(requestedCommand)) {
          command.runCommand();
          foundCommand = true;
        }
      }
      if (!foundCommand) System.err.println("INVALID COMMAND\n");
    }
    System.out.println("Goodbye.");
  }

  private static void printCommands(ArrayList<Commands.Command> commands) {
    commands.forEach(Commands.Command::printCommandListing);
  }

  protected static void quit() {
    done = true;
  }
}
