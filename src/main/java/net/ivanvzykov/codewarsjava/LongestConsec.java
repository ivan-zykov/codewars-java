package net.ivanvzykov.codewarsjava;

import java.util.Arrays;

// https://www.codewars.com/kata/56a5d994ac971f1ac500003e
class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {
        if (strarr.length < k || k <= 0) return "";

        var lengthsOfStrings = Arrays.stream(strarr)
                .map(String::length)
                .toList();

        var firstIdxOfLongestConsStrings = 0;
        var maxLenOfConsStrings = 0;
        for (int i = 0; i + k <= lengthsOfStrings.size(); i++) {
            var sublist = lengthsOfStrings.subList(i, i + k);
            var lenOfConsStrings = sublist.stream().reduce(Integer::sum)
                    .orElseThrow(IllegalArgumentException::new);
            if (maxLenOfConsStrings < lenOfConsStrings) {
                maxLenOfConsStrings = lenOfConsStrings;
                firstIdxOfLongestConsStrings = i;
            }
        }

        var builder = new StringBuilder();
        for (int i = firstIdxOfLongestConsStrings; i < firstIdxOfLongestConsStrings + k; i++) {
            builder.append(strarr[i]);
        }

        return builder.toString();
    }
}
