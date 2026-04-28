package net.ivanvzykov.codewarsjava;

import java.util.HashMap;

// https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1
public class CountingDuplicates {
    public static int duplicateCount(String text) {
        var map = new HashMap<String, Integer>();

        text.chars()
                .mapToObj(c -> String.valueOf((char) c).toLowerCase())
                .forEach(s -> map.merge(s, 1, Integer::sum));

        var result = map.values().stream()
                .filter(num -> num > 1)
                .count();

        return (int) result;
    }
}
