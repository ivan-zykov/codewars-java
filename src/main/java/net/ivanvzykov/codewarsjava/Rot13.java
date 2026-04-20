package net.ivanvzykov.codewarsjava;

import java.util.stream.Collectors;

// https://www.codewars.com/kata/530e15517bc88ac656000716
public class Rot13 {
    public static String rot13(String str) {
        return str.chars()
                .mapToObj(Rot13::getShiftedChar)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    private static char getShiftedChar(int c) {
        if ('A' <= c && c <= 'Z') {
            return shiftWithUpperBound(c, 'Z');
        } else if ('a' <= c && c <= 'z') {
            return shiftWithUpperBound(c, 'z');
        } else {
            return (char) c;
        }
    }

    private static char shiftWithUpperBound(int c, char last) {
        int result;
        if (c + 13 <= last) {
            result = c + 13;
        } else {
            result = c - 13;
        }
        return (char) result;
    }
}
