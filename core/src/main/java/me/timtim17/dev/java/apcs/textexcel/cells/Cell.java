package me.timtim17.dev.java.apcs.textexcel.cells;

import me.timtim17.dev.java.apcs.textexcel.util.Utility;

import org.jetbrains.annotations.NotNull;

public class Cell<T> {
  private T contents;

  public Cell(@NotNull T contents) {
    this.contents = contents;
  }

  @NotNull
  public T getContents() {
    return contents;
  }

  @NotNull
  public String getShortenedContents() {
    String contentsToString = String.valueOf(getContents());
    return (contentsToString.length() < 8) ? (contentsToString + Utility.tabOfSpaces(contentsToString.length())) :
            ((contentsToString.length() == 8) ? contentsToString : (contentsToString.substring(0, 5) + "..."));
  }
}
