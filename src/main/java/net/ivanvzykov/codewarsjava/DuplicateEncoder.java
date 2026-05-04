package net.ivanvzykov.codewarsjava;

import java.util.HashMap;

// https://www.codewars.com/kata/54b42f9314d9229fd6000d9c
public class DuplicateEncoder {
    static String encode(String word) {
        var frequencies = new HashMap<Character, Integer>();

        word.codePoints()
                .map(Character::toLowerCase)
                .forEach(c -> frequencies.merge((char) c, 1, Integer::sum));

        var result = new StringBuilder();

        word.chars().forEach(c -> {
            var symbol = (char) Character.toLowerCase(c);
            var symbolFreq = frequencies.get(symbol);
            var symbolEncoded = symbolFreq > 1 ? ")" : "(";
            result.append(symbolEncoded);
        });

        return result.toString();
    }
}
