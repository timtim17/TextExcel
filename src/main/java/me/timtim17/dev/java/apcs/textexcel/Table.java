package me.timtim17.dev.java.apcs.textexcel;

import org.jetbrains.annotations.NotNull;
import me.timtim17.dev.java.apcs.textexcel.cells.*;

public class Table {
    private Cell<?>[][] cells;

    public Table(int rows, int cols) {
        cells = new Cell<?>[rows][cols];
        for(int i = 0; i < cells.length; i++) {
            for(int j = 0; j < cells[i].length; j++) {
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
}
