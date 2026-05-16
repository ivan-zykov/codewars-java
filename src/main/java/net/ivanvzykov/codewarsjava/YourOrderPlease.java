package net.ivanvzykov.codewarsjava;

// https://www.codewars.com/kata/55c45be3b2079eccff00010f
public class YourOrderPlease {
    public static String order(String words) {
        if (words.isBlank()) {
            return "";
        }

        String[] wordsSplit = words.split(" ");

        String[] wordsOrdered = new String[wordsSplit.length];

        for (String word : wordsSplit) {
            int numberInWord = word.codePoints()
                    .filter(c -> '1' <= c && c <= '9')
                    .map(c -> c - '0')
                    .findFirst()
                    .orElseThrow();

            wordsOrdered[numberInWord - 1] = word;
        }

        return String.join(" ", wordsOrdered);
    }
}
