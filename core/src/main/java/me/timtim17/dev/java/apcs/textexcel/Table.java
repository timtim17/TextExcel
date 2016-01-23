package me.timtim17.dev.java.apcs.textexcel;

import me.timtim17.dev.java.apcs.textexcel.util.Utility;

import org.jetbrains.annotations.NotNull;

import me.timtim17.dev.java.apcs.textexcel.cells.*;

public class Table {
  private Cell<?>[][] cells;

  public Table(int rows, int cols) {
    cells = new Cell<?>[rows][cols];
    for (int i = 0; i < cells.length; i++) {
      for (int j = 0; j < cells[i].length; j++) {
        cells[i][j] = new EmptyCell();
      }
    }
  }

  public Cell<?>[][] getCells() {
    return cells;
  }

  public Cell getCell(int row, int col) {
    return cells[row][col];
  }

  public void setCell(int row, int col, @NotNull Cell<?> newCell) {
    cells[row][col] = newCell;
  }

  public void print() {
    // TODO: Add a border to the table.
    // TODO: Add row headers.
    Cell<?>[][] cells = getCells();
    try {
      System.out.println(Utility.generateHeaders(cells.length));
    } catch (IllegalArgumentException e) {
      e.printStackTrace();
    }
    for (Cell<?>[] row : cells) {
      System.out.print("|");
      for (Cell<?> cell : row) {
        System.out.print(cell.getShortenedContents());
        System.out.print("|");  // TODO: Get better ASCII art
      }
      System.out.println();
    }
  }

  @NotNull
  public static Table getNewTable(int rows, int cols) {
    return new Table(rows, cols);
  }
}
