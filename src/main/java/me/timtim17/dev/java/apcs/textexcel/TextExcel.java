package me.timtim17.dev.java.apcs.textexcel;

public class TextExcel {
    public static void main(String[] args) throws Exception {
        Table table = getNewTable(5, 5);
        print(table);
    }

    public static Table getNewTable(int rows, int cols) {
        return new Table(rows, cols);
    }

    public static void print(Table table) {
        // TODO: Start this.
        // TODO: Add a border to the table.
        // TODO: Add row and collum headers.
        Cell<?>[][] cells = table.getCells();
        for (Cell<?>[] row : cells) {
            for (Cell<?> cell : row) {
                System.out.print(cell.getShortenedContents());
                System.out.print("|");  // TODO: Get better ASCII art
            }
            System.out.println();
        }
    }
}
