package me.timtim17.dev.java.apcs.textexcel;

import me.timtim17.dev.java.apcs.textexcel.cells.Cell;
import me.timtim17.dev.java.apcs.textexcel.cells.EmptyCell;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TableTest {
  private Table table;

  @Before
  public void setUp() {
    table = new Table(5, 5);
  }

  @Test
  public void testRowsAndCols() {
    Cell<?>[][] cells = table.getCells();

    assertEquals(cells.length, 5);

    for (Cell<?>[] row : cells) {
      assertEquals(row.length, 5);
    }
  }

  @Test
  public void testSetCell() {
    Cell newCell = new EmptyCell();
    table.setCell(0, 0, newCell);
    assertEquals(newCell, table.getCell(0, 0));
  }
}