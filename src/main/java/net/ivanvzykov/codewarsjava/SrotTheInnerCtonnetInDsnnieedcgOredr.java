package net.ivanvzykov.codewarsjava;

import java.util.Arrays;
import java.util.Comparator;

public class SrotTheInnerCtonnetInDsnnieedcgOredr {
    public static String sortTheInnerContent(String words) {
        String[] wordsArray = words.split(" ");

        for (int i = 0; i < wordsArray.length; i++) {
            if (wordsArray[i].length() < 4) continue;
            // Sort inner characters
            var charsOfWord = new Character[wordsArray[i].length()];
            for (int j = 0; j < wordsArray[i].length() - 1; j++) {
                charsOfWord[j] = (char) wordsArray[i].codePointAt(j);
            }
            Arrays.sort(charsOfWord, 1, charsOfWord.length - 1, Comparator.reverseOrder());
            // Build whole sorted string
            StringBuilder wordSorted = new StringBuilder();
            for (Character c : charsOfWord) {
                wordSorted.append(c);
            }

            wordsArray[i] = wordSorted.toString();
        }

        return String.join(" ", wordsArray);
    }
}
