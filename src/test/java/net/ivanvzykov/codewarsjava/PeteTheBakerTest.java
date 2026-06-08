package net.ivanvzykov.codewarsjava;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PeteTheBakerTest {
    @Test
    void basicTest() {
        Map<String, Integer> recipe = Map.of(
                "flour", 500,
                "sugar", 200,
                "eggs", 1);
        Map<String, Integer> available = Map.of(
                "flour", 1200,
                "sugar", 1200,
                "eggs", 5,
                "milk", 200);
        assertEquals(2, PeteTheBaker.cakes(recipe, available), "For recipe " + recipe + " and ingredients " + available);
    }

    @Test
    void missingIngredient() {
        Map<String, Integer> recipe = Map.of(
                "flour", 500,
                "sugar", 200,
                "eggs", 1,
                "cinnamon", 300);
        Map<String, Integer> available = Map.of(
                "flour", 1200,
                "sugar", 1200,
                "eggs", 5,
                "milk", 200);
        assertEquals(0, PeteTheBaker.cakes(recipe, available), "For recipe " + recipe + " and ingredients " + available);
    }
}
