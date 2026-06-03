package net.ivanvzykov.codewarsjava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FindTheUniqueNumberTest {

    private final double precision = 0.0000000000001;

    @Test
    public void sampleTestCases() {
        assertEquals(1.0, FindTheUniqueNumber.findUniq(new double[]{0, 1, 0}), precision);
        assertEquals(2.0, FindTheUniqueNumber.findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision);
        assertEquals(2.5, FindTheUniqueNumber.findUniq(new double[]{1.7, 1.7, 1.7, 2.5, 1.7, 1.7}), precision);
        assertEquals(2.5, FindTheUniqueNumber.findUniq(new double[]{2.5, 1.7, 1.7, 1.7, 1.7, 1.7}), precision);
        assertEquals(2.5, FindTheUniqueNumber.findUniq(new double[]{1.7, 1.7, 1.7, 1.7, 1.7, 2.5}), precision);
        assertEquals(-2.5, FindTheUniqueNumber.findUniq(new double[]{-2.5, -1.7, -1.7}), precision);
        assertEquals(-2.5, FindTheUniqueNumber.findUniq(new double[]{-2.5, 1.7, 1.7}), precision);

        assertThrows(
                IllegalArgumentException.class,
                () -> FindTheUniqueNumber.findUniq(new double[]{1, 1, 1})
        );
    }
}
