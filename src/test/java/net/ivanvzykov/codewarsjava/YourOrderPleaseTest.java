package net.ivanvzykov.codewarsjava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YourOrderPleaseTest {
    @Test
    public void test1() {
        assertEquals("Thi1s is2 3a T4est", YourOrderPlease.order("is2 Thi1s T4est 3a"));
    }

    @Test
    public void test2() {
        assertEquals("Fo1r the2 g3ood 4of th5e pe6ople", YourOrderPlease.order("4of Fo1r pe6ople g3ood th5e the2"));
    }

    @Test
    public void test3() {
        assertEquals("", YourOrderPlease.order(""), "Empty input should return empty string");
    }
}
