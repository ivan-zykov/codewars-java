package net.ivanvzykov.codewarsjava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoesMyNumberLookBigInThisTest {
    @Test
    void exampleTests() {
        assertTrue(DoesMyNumberLookBigInThis.isNarcissistic(153), "153 is narcissistic");
        assertTrue(DoesMyNumberLookBigInThis.isNarcissistic(1634), "1634 is narcissistic");
        assertFalse(DoesMyNumberLookBigInThis.isNarcissistic(112), "112 is not narcissistic");
    }
}
