package me.timtim17.dev.java.apcs.textexcel.cells;

public class Cell<T> {
    private T contents;

    public Cell(T contents) {
        this.contents = contents;
    }

    public T getContents() {
        return contents;
    }

    public String getShortenedContents() {
        String contentsToString = String.valueOf(getContents());
        return (contentsToString.length() < 8) ? (contentsToString + "\t") :
                                                 ((contentsToString.length() == 8) ? contentsToString : (contentsToString.substring(0, 5) + "..."));
    }
}
