package textExcel;

import java.util.Arrays;

public class Spreadsheet implements Grid {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
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
        resetGrid();
    }

    private void resetGrid() {
        for (Cell[] row : grid) {
            Arrays.fill(row, new EmptyCell());
        }
    }

    @Override
    public String processCommand(String command) {
        String[] split = command.split(" ");
        int num_words = split.length;
        if (num_words == 1) {
            command = command.toLowerCase();
            switch (command) {
                case "clear":
                    resetGrid();
                    return "";
                case "print":
                    return getGridText();
                default:
                    try {
                        return getCell(new SpreadsheetLocation(command)).fullCellText();
                    } catch (Exception ignored) {
                        return "ERROR";
                    }
            }
        } else if (num_words == 2 && split[0].toLowerCase().equals("clear")) {
            Location location = new SpreadsheetLocation(split[1]);
            grid[location.getRow()][location.getCol()] = new EmptyCell();
            return "";
        } else {
            try {
                Location location = new SpreadsheetLocation(split[0]);
                String content = String.join(" ", Arrays.copyOfRange(split, 2, split.length));
                grid[location.getRow()][location.getCol()] = new StringCell(content.substring(1, content.length() - 1));
            } catch (Exception e) {
                return "ERROR";
            }
            return "";
        }
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
        return grid[loc.getRow()][loc.getCol()];
    }

    @Override
    public String getGridText() {
        StringBuilder grid = new StringBuilder();
        StringBuilder row = new StringBuilder();
        row.append("   |");
        for (int i = 0; i < getCols(); i++) {
            row.append(ALPHABET.charAt(i)).append("         |");
        }
        grid.append(row.toString()).append("\n");
        for (int i = 0; i < getRows(); i++) {
            row = new StringBuilder();
            String num = String.valueOf(i + 1);
            row.append(num);
            for (int j = num.length(); j < 3; j++)
                row.append(" ");
            row.append("|");
            for (int j = 0; j < getCols(); j++)
                row.append(this.grid[i][j].abbreviatedCellText()).append("|");
            grid.append(row).append("\n");
        }
        return grid.toString();
    }
}
