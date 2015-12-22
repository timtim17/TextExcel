package me.timtim17.dev.java.apcs.textexcel;

import org.jetbrains.annotations.NotNull;
import me.timtim17.dev.java.apcs.textexcel.cells.Cell;
import me.timtim17.dev.java.apcs.textexcel.utility.Utility;

public class TextExcel {
    public static void main(String[] args) throws Exception {
        Table table = getNewTable(5, 5);
        print(table);
    }

    @NotNull
    public static Table getNewTable(int rows, int cols) {
        return new Table(rows, cols);
    }

    public static void print(@NotNull Table table) {
        // TODO: Start this.
        // TODO: Add a border to the table.
        // TODO: Add row headers.
        Cell<?>[][] cells = table.getCells();
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
}
