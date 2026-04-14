package net.ivanvzykov.codewarsjava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RgbToHexConversionTest {
    @Test
    public void sampleTests() {
        assertEquals("000000", RgbToHexConversion.rgb(0, 0, 0), "For input: (0, 0, 0)");
        assertEquals("010203", RgbToHexConversion.rgb(1, 2, 3), "For input: (1, 2, 3)");
        assertEquals("FFFFFF", RgbToHexConversion.rgb(255, 255, 255), "For input: (255, 255, 255)");
        assertEquals("FEFDFC", RgbToHexConversion.rgb(254, 253, 252), "For input: (254, 253, 252)");
        assertEquals("00FF7D", RgbToHexConversion.rgb(-20, 275, 125), "For input: (-20, 275, 125)");
    }
}
