package net.ivanvzykov.codewarsjava;

import java.util.HashMap;
import java.util.Map;

// https://www.codewars.com/kata/52bc74d4ac05d0945d00054e
public class FirstNonRepeatingCharacter {
    public static String firstNonRepeatingLetter(String s) {
        Map<Character, Integer> frequencies = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            int c = s.codePointAt(i);
            frequencies.merge((char) Character.toLowerCase(c), 1, Integer::sum);
        }

        for (int i = 0; i < s.length(); i++) {
            int c = s.codePointAt(i);
            if (frequencies.get((char) Character.toLowerCase(c)) == 1) {
                return Character.toString(c);
            }
        }

        return "";
    }
}
