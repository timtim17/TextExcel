package textExcel;

public class SpreadsheetLocation implements Location {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private final int row;
    private final int col;

    public SpreadsheetLocation(String location) throws IllegalArgumentException {
        if (!Character.isLetter(location.charAt(0)))
            throw new IllegalArgumentException("Location is not a valid cell location.");
        col = ALPHABET.indexOf(String.valueOf(location.charAt(0)).toLowerCase());   // conversion to string is needed
                                                                                    // because subtracting to the char
                                                                                    // wouldn't work if the char is
                                                                                    // already lowercase
        row = Integer.valueOf(location.substring(1)) - 1;
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
