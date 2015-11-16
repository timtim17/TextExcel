package me.timtim17.dev.java.apcs.textexcel;

import me.timtim17.dev.java.apcs.textexcel.cells.Cell;

class Table {
    private Cell<?>[][] cells;

    public Table(int rows, int cols) {
        cells = new Cell<?>[rows][cols];
    }

    public Cell<?>[][] getCells() {
        return cells;
    }

    public Cell getCell(int row, int col) {
        return cells[row][col];
    }

    public void setCell(int row, int col, Cell<?> newCell) {
        cells[row][col] = newCell;
    }
}
