package textExcel;

public class SpreadsheetLocation implements Location {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private final int row;
    private final int col;

    public SpreadsheetLocation(String location) {
        // this isn't really necessary, but in case there's a location that has multiple letters,
        // loop through the location until we run into a non-string char
        StringBuilder sb = new StringBuilder();
        int index = 0;
        char c = location.charAt(index);
        // there's at least one char that's a letter
        while (Character.isLetter(c)) {
            sb.append(c);
            c = location.charAt(++index);
        }
        String letters = sb.toString().toLowerCase();
        col = (letters.length() - 1) * 26 + ALPHABET.indexOf(letters.charAt(letters.length() - 1));
        row = Integer.valueOf(location.substring(index)) - 1;
    }

    @Override
    public int getRow() {
        return row;
    }

    @Override
    public int getCol() {
        return col;
    }
}
