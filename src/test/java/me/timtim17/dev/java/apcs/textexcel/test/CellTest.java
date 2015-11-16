package me.timtim17.dev.java.apcs.textexcel.test;

import me.timtim17.dev.java.apcs.textexcel.cells.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class CellTest {
    @Test
    public void testNumberCellGetShortenedContentsNoShorten() {
        NumberCell cell = new NumberCell(5F);
        assertEquals("5.0\t", cell.getShortenedContents());
    }

    @Test
    public void testNumberCellGetShortenedContentsYesShorten() {
        NumberCell cell = new NumberCell(5.55555555F);
        assertEquals("5.555...", cell.getShortenedContents());
    }

    @Test
    public void testNumberCellGetContents() {
        NumberCell cell = new NumberCell((float) Math.PI);
        assertEquals((float) Math.PI, cell.getContents(), 0F);
    }

    @Test
    public void testStringCellGetShortenedContentsNoShorten() {
        StringCell cell = new StringCell("abcdefgh");
        assertEquals("abcdefgh", cell.getShortenedContents());
    }

    @Test
    public void testStringCellGetShortenedContentsYesShorten() {
        StringCell cell = new StringCell("abcdefghi");
        assertEquals("abcde...", cell.getShortenedContents());
    }

    @Test
    public void testStringCellGetContents() {
        StringCell cell = new StringCell("abc");
        assertEquals("abc", "abc");
    }

    @Test
    public void testEmptyCellGetShortenedContents() {
        EmptyCell cell = new EmptyCell();
        assertEquals("        ", cell.getShortenedContents());
    }

    @Test
    public void testEmptyCellGetContents() {
        EmptyCell cell = new EmptyCell();
        assertEquals("        ", cell.getContents());
    }
}