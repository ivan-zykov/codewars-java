package net.ivanvzykov.codewarsjava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreedIsGoodTest {
    @Test
    public void shouldBeWorthless() {
        assertEquals(0, GreedIsGood.greedy(new int[]{2, 3, 4, 6, 2}));
    }

    @Test
    public void shouldValueTriplets() {
        assertEquals(400, GreedIsGood.greedy(new int[]{4, 4, 4, 3, 3}));
    }

    @Test
    public void shouldValueMixedSets() {
        assertEquals(1100, GreedIsGood.greedy(new int[]{1, 1, 1, 1, 2}));
        assertEquals(450, GreedIsGood.greedy(new int[]{2, 4, 4, 5, 4}));
    }
}
