package me.timtim17.dev.java.apcs.textexcel.cells;

public abstract class Cell<T> {
    private T contents;

    public Cell(T contents) {
        this.contents = contents;
    }

    public T getContents() {
        return contents;
    }

    public abstract String getShortenedContents();
}
