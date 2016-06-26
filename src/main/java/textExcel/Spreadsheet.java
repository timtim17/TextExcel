package textExcel;

import java.util.Arrays;

public class Spreadsheet implements Grid {
    private final int rows;
    private final int cols;
    private Cell[][] grid;

    public Spreadsheet() {
        this(20, 12);
    }

    public Spreadsheet(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;

        grid = new Cell[rows][cols];
        for (Cell[] row : grid) {
            Arrays.fill(row, new EmptyCell());
        }
    }

    @Override
    public String processCommand(String command) {
        return command;
    }

    @Override
    public int getRows() {
        return rows;
    }

    @Override
    public int getCols() {
        return cols;
    }

    @Override
    public Cell getCell(Location loc) {
        return null;
    }

    @Override
    public String getGridText() {
        return null;
    }
}
