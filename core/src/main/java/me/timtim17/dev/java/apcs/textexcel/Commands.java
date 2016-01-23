package me.timtim17.dev.java.apcs.textexcel;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;

public class Commands {
  private static ArrayList<Command> COMMANDS = null;

  @NotNull
  protected static ArrayList<Command> getCommands(@NotNull Table table) {
    if (COMMANDS == null) {
      COMMANDS = new ArrayList<>();
      COMMANDS.add(new Command("print", "Prints the table.", table::print));
      COMMANDS.add(new Command("edit"));
      COMMANDS.add(new Command("math"));
    }
    return COMMANDS;
  }

  protected static void addCommand(@NotNull Command command) {
    COMMANDS.add(command);
  }

  @Contract("_ -> fail")
  protected static void removeCommand(int index) {
    throw new NotImplementedException();
  }

  protected static class Command {
    private String name;
    private String description;
    private Runnable command;

    public Command(@NotNull String name, @Nullable String description, @NotNull Runnable command) {
      this.name = name;
      this.description = description == null ? "No description provided." : description;
      this.command = command;
    }

    public Command(@NotNull String name, @NotNull Runnable command) {
      this(name, "No description provided.", command);
    }

    public Command(@NotNull String name) {
      this(name, () -> System.err.println("Not yet implemented."));
    }

    public void runCommand() {
      command.run();
    }

    public void printCommandListing() {
      System.out.println(getCommandListing());
    }

    @NotNull
    public String getCommandListing() {
      return name + "\t→\t" + description;
    }

    @NotNull
    public String getName() {
      return name;
    }

    @NotNull
    public String getDescription() {
      return description;
    }
  }
}
