package net.ivanvzykov.codewarsjava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplesOf3or5Test {
    @Test
    public void test() {
        assertEquals(23, new MultiplesOf3or5().solution(10));
    }
}