package net.ivanvzykov.codewarsjava;

import java.util.Arrays;
import java.util.Comparator;

// https://www.codewars.com/kata/55c6126177c9441a570000cc
public class WeightForWeight {
    public static String orderWeight(String strng) {
        String[] strngSplit = strng.split("\\s+");

        Arrays.sort(
                strngSplit,
                Comparator.comparingLong(WeightForWeight::weightOf)
                        .thenComparing(String::compareTo)
        );

        return String.join(" ", strngSplit);
    }

    private static long weightOf(String num) {
        long weight = 0;
        for (int i = 0; i < num.length(); i++) {
            weight += num.charAt(i) - '0';
        }

        return weight;
    }
}
