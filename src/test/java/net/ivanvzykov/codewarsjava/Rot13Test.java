package net.ivanvzykov.codewarsjava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Rot13Test {
    @Test
    void testRot13() {
        // assertEquals("expected", "actual");
        assertEquals("grfg", Rot13.rot13("test"), "Input: \"test\"");
        assertEquals("Grfg", Rot13.rot13("Test"), "Input: \"Test\"");
    }
}
