package net.ivanvzykov.codewarsjava;

import java.util.*;

// Sorting, Arrays, Algorithms
// https://www.codewars.com/kata/5340298112fa30e786000688
public class DifferenceOf2 {
    public static int[][] twosDifference(int[] array) {
        var inputSet = new HashSet<Integer>(Math.max((int) (array.length / 0.75f), 16));
        for (int n : array) {
            inputSet.add(n);
        }

        int countOfPairs = 0;
        for (int n : array) {
            if (inputSet.contains(n + 2)) {
                countOfPairs++;
            }
        }
        int writeIdx = 0;
        int[][] pairs = new int[countOfPairs][2];
        for (int n : array) {
            if (inputSet.contains(n + 2)) {
                pairs[writeIdx] = new int[]{n, n + 2};
                writeIdx++;
            }
        }

        Arrays.sort(pairs, Comparator.comparingInt(pair -> pair[0]));

        return pairs;
    }
}
