package net.ivanvzykov.codewarsjava;

import java.util.HashMap;

public class Scramblies {
    public static boolean scrambleMap(String str1, String str2) {
        var frequencies = new HashMap<Character, Integer>(36);

        for (int i = 0; i < str1.length(); i++) {
            frequencies.merge(str1.charAt(i), 1, Integer::sum);
        }

        for (int i = 0; i < str2.length(); i++) {
            if (frequencies.getOrDefault(str2.charAt(i), 0) < 1) {
                return false;
            }
            frequencies.merge(str2.charAt(i), -1, Integer::sum);
        }

        return true;
    }

    public static boolean scramble(String str1, String str2) {
        var frequencies = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            frequencies[str1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < str2.length(); i++) {
            int freqIdx = str2.charAt(i) - 'a';
            if (frequencies[freqIdx] < 1) {
                return false;
            }
            frequencies[freqIdx]--;
        }

        return true;
    }
}
