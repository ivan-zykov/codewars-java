package net.ivanvzykov.codewarsjava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfDigitsDigitalRootTest {
    @Test
    public void Test1() {
        assertEquals(7, new SumOfDigitsDigitalRoot().digital_root(16));
    }

    @Test
    public void Test2() {
        assertEquals(6, new SumOfDigitsDigitalRoot().digital_root(456));
    }

}