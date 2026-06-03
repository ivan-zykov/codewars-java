package net.ivanvzykov.codewarsjava;

public class FindTheMissingLetter {
    public static char findMissingLetter(char[] array) {
        char prev = array[0];

        for (char curr : array) {
            if (curr - prev > 1) {
                return (char) (prev + 1);
            } else {
                prev = curr;
            }
        }

        throw new IllegalArgumentException("Failed to find missing letter in input array");
    }
}
