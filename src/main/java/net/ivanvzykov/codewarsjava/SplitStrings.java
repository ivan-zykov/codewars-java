package net.ivanvzykov.codewarsjava;

// https://www.codewars.com/kata/515de9ae9dcfc28eb6000001
public class SplitStrings {
    public static String[] solution(String s) {
        int numOfPairs = s.length() % 2 == 0 ? s.length() / 2 : (s.length() + 1) / 2;
        var result = new String[numOfPairs];

        var temp = new StringBuilder();

        for (int i = 0; i < numOfPairs; i++) {
            temp.append(s.charAt(2 * i));
            char secondValue = '_';
            int secondIdx = 2 * i + 1;
            if (secondIdx < s.length()) {
                secondValue = s.charAt(secondIdx);
            }
            temp.append(secondValue);

            result[i] = temp.toString();
            temp = new StringBuilder();
        }

        return result;
    }
}
