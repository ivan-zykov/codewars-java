package net.ivanvzykov.codewarsjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// https://www.codewars.com/kata/5526fc09a1bbd946250002dc
public class FindParityOutlier {
    static int find(int[] integers) {
        var map = new HashMap<Boolean, List<Integer>>();

        for (int i : integers) {
            var isEven = i % 2 == 0;
            map.merge(isEven, List.of(i), (existingValue, newValue) -> {
                var newList = new ArrayList<>(existingValue);
                newList.addAll(newValue);
                return newList;
            });
        }

        return map.values().stream()
                .filter(entry -> entry.size() == 1)
                .findFirst().orElseThrow()
                .stream()
                .findFirst().orElseThrow();
    }
}
