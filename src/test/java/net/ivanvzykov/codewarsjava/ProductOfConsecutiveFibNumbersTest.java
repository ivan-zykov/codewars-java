package net.ivanvzykov.codewarsjava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfConsecutiveFibNumbersTest {
    @Test
    public void test1() {
        long[] r = new long[]{55, 89, 1};
        assertArrayEquals(r, ProductOfConsecutiveFibNumbers.productFib(4895));
    }

    @Test
    public void test2() {
        long[] r = new long[]{89, 144, 0};
        assertArrayEquals(r, ProductOfConsecutiveFibNumbers.productFib(5895));
    }
}
