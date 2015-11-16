package me.timtim17.dev.java.apcs.textexcel.cells;

public class NumberCell extends Cell<Float> {
    public NumberCell(Float contents) {
        super(contents);
    }

    @Override
    public String getShortenedContents() {
        String contentsToString = super.getContents().toString();
        return (contentsToString.length() <= 8) ? contentsToString : (contentsToString.substring(0, 5) + "...");
    }
}
