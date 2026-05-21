package net.ivanvzykov.codewarsjava;

import java.util.HashSet;
import java.util.Set;

// https://www.codewars.com/kata/545cedaa9943f7fe7b000048
public class DetectPangram {

    public static final Set<Character> ALPHABET = Set.of(
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    );

    public boolean checkAlt(String sentence) {
        Set<Character> lettersOfSentence = new HashSet<>();

        for (char c : sentence.toCharArray()) {
            var cLower = Character.toLowerCase(c);
            if ('a' <= cLower && cLower <= 'z') {
                lettersOfSentence.add(cLower);
            }
        }

        return ALPHABET.equals(lettersOfSentence);
    }

    public boolean check(String sentence) {
        boolean[] seen = new boolean[26];

        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char charLower = Character.toLowerCase(sentence.charAt(i));

            if ('a' <= charLower && charLower <= 'z') {
                int indexOfChar = charLower - 'a';

                if (!seen[indexOfChar]) {
                    seen[indexOfChar] = true;
                    count++;
                }

                if (count == 26) {
                    return true;
                }
            }
        }

        return false;
    }
}
