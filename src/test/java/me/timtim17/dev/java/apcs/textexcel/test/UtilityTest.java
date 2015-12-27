package me.timtim17.dev.java.apcs.textexcel.test;

import me.timtim17.dev.java.apcs.textexcel.utility.Utility;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilityTest {

    @Test
    public void testGenerateHeaders() {
        assertEquals("|A       |", Utility.generateHeaders(1));
        assertEquals("|A       |B       |", Utility.generateHeaders(2));
        assertEquals("|A       |B       |C       |D       |E       |F       |G       |H       |I       |J       |K       |L       |M       |N       |O       |P       |Q       |R       |S       |T       |U       |V       |W       |X       |Y       |Z       |AA      |", Utility.generateHeaders(27));
    }

    @Test(expected=IllegalArgumentException.class)
    public void testGenerateHeadersException() {
        Utility.generateHeaders(0);
    }

    @Test
    public void testTabOfSpaces() {
        assertEquals("        ", Utility.tabOfSpaces(0));
        assertEquals("       ", Utility.tabOfSpaces(1));
        assertEquals("      ", Utility.tabOfSpaces(2));
        assertEquals("     ", Utility.tabOfSpaces(3));
        assertEquals("    ", Utility.tabOfSpaces(4));
        assertEquals("   ", Utility.tabOfSpaces(5));
        assertEquals("  ", Utility.tabOfSpaces(6));
        assertEquals(" ", Utility.tabOfSpaces(7));
        assertEquals("", Utility.tabOfSpaces(8));
    }

    @Test(expected=IllegalArgumentException.class)
    public void testTabOfSpacesException() {
        Utility.tabOfSpaces(-1);
    }
}