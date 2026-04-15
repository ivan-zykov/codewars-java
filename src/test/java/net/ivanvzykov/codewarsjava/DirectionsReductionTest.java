package net.ivanvzykov.codewarsjava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirectionsReductionTest {

    @Test
    public void testSimpleReduce() {
        assertArrayEquals(new String[]{"WEST"}, DirectionsReduction.reduce(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}), "\"NORTH\", \"SOUTH\", \"SOUTH\", \"EAST\", \"WEST\", \"NORTH\", \"WEST\"");
        assertArrayEquals(new String[]{}, DirectionsReduction.reduce(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH"}), "\"NORTH\",\"SOUTH\",\"SOUTH\",\"EAST\",\"WEST\",\"NORTH\"");
    }
}
