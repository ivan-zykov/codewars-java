package net.ivanvzykov.codewarsjava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarraySumTest {
    @Test
    public void testEmptyArray() {
        assertEquals(0, MaximumSubarraySum.sequence(new int[]{}), "Empty arrays should have a max of 0");
    }

    @Test
    public void testExampleArray() {
        assertEquals(6, MaximumSubarraySum.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}), "Example array should have a max of 6");
    }
}
