package net.ivanvzykov.codewarsjava;

import java.util.HashMap;
import java.util.Objects;

// https://www.codewars.com/kata/54da539698b8a2ad76000228
public class TenMinWalk {

    public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }

        var frequencies = new HashMap<Character, Integer>();

        for (char c : walk) {
            frequencies.merge(c, 1, Integer::sum);
        }

        return Objects.equals(frequencies.get('e'), frequencies.get('w')) &&
                Objects.equals(frequencies.get('s'), frequencies.get('n'));
    }
}
