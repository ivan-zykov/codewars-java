package net.ivanvzykov.codewarsjava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindParityOutlierTest {
    @Test
    void sampleTests() {
        assertEquals(3, FindParityOutlier.find(new int[]{2, 6, 8, -10, 3}));
        assertEquals(206847684, FindParityOutlier.find(new int[]{206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781}));
        assertEquals(0, FindParityOutlier.find(new int[]{Integer.MAX_VALUE, 0, 1}));
    }
}
