package me.timtim17.dev.java.apcs.textexcel;

public class TextExcel {
    public static void main(String[] args) throws Exception {
        Table table = getNewTable(5, 5);
        print(table);
    }

    public static Table getNewTable(int rows, int cols) {
        return new Table(rows, cols);
    }

    public static void print(Table table) throws Exception {
        // TODO: Start this.
    }
}
