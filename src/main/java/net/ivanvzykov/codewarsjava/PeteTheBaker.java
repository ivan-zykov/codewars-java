package net.ivanvzykov.codewarsjava;

import java.util.Map;

// https://www.codewars.com/kata/525c65e51bf619685c000059
public class PeteTheBaker {
    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        int minCount = Integer.MAX_VALUE;

        for (String ingNeed : recipe.keySet()) {
            if (!available.containsKey(ingNeed)) {
                return 0;
            }

            int unitsAval = available.get(ingNeed);
            int count = unitsAval / recipe.get(ingNeed);
            if (count < minCount) {
                minCount = count;
            }
        }

        return minCount;
    }
}
