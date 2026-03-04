package net.ivanvzykov.codewarsjava;

import java.util.HashMap;
import java.util.Map;

public class FindTheOddInt {
    public static int findIt(int[] a) {
        Map<Integer, Integer> frequencies = new HashMap<>();

        for (int i : a) {
            frequencies.merge(i, 1, Integer::sum);
        }

        return frequencies.entrySet().stream()
                .filter(e -> e.getValue() % 2 != 0)
                .findFirst()
                .orElseThrow()
                .getKey();
    }
}
