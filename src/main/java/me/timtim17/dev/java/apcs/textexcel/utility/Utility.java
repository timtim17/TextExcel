package me.timtim17.dev.java.apcs.textexcel.utility;

import org.jetbrains.annotations.NotNull;

public class Utility {
    private static final String rowNames = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /**
     * Generates headers in the form {@code |A       |B       |...|ZZZ     |}.
     * {@code length} specifies the number of columns.
     * Expects a length > 0.
     *
     * @param length length > 0
     * @throws IllegalArgumentException if length <= 0
     * @return A string in the form {@code |A       |B       |...|ZZZ     |}
     */
    @NotNull
    public static String generateHeaders(int length) throws IllegalArgumentException {
        if (length <= 0) throw new IllegalArgumentException("Invalid length.");
        StringBuilder sb = new StringBuilder().append("|");
        for (int rowNum = 0; rowNum < length; rowNum++) {
            String rowName = "";
            for (int temp = 0; temp < Math.floor(rowNum / 26) + 1; temp++) {
                rowName += rowNames.charAt(rowNum % 26);
            }
            sb.append(rowName).append(tabOfSpaces(rowName.length())).append("|");
        }
        return sb.toString();
    }

    /**
     * Essentially preforms the task of {@code \t}, but with spaces.
     * In most IDEs and programs, \t fills the remaining room with whitespace for the equivalent of 8 chars. (i.e. {@code "a\t" would be {@code "a"} + 7 spaces})
     * However, in some IDEs such as IDEA, an {@code \t} appears larger than 8 spaces, which doesn't work well for this program, since some things are hardcoded as 8 spaces.
     * This method simply returns the remaining spaces, so that everything appears uniform.
     * This program (and this method) expects everything to have a minimum length of 0, and a maximum length of 8.
     *
     * @param lengthOfContent length of content already in >= 0 and <= 8
     * @throws IllegalArgumentException if length of content < 0
     * @return A string containing the remaining number of spaces.
     */
    @NotNull
    public static String tabOfSpaces(int lengthOfContent) throws IllegalArgumentException {
        if (lengthOfContent < 0) throw new IllegalArgumentException("Invalid lengthOfContent.");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8 - lengthOfContent; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }
}
