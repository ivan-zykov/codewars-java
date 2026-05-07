package net.ivanvzykov.codewarsjava;

import java.util.stream.Collectors;

// https://www.codewars.com/kata/546f922b54af40e1e90001da
public class ReplaceWithAlphabetPosition {
    static String alphabetPosition(String text) {
        return text.codePoints()
                .map(Character::toLowerCase)
                .filter(c -> 'a' <= c && c <= 'z')
                .mapToObj(c -> String.valueOf(c - 'a' + 1))
                .collect(Collectors.joining(" "));
    }
}
