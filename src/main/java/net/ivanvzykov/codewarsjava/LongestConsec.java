package net.ivanvzykov.codewarsjava;

// https://www.codewars.com/kata/56a5d994ac971f1ac500003e
class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {
        if (strarr.length < k || k <= 0) return "";

        var bestStartIdx = 0;
        var curLen = 0;
        for (int i = 0; i < k; i++) {
            curLen += strarr[i].length();
        }
        var maxLen = curLen;

        for (int i = 1; i + k <= strarr.length; i++) {
            curLen += strarr[i + k - 1].length();
            curLen -= strarr[i - 1].length();
            if (maxLen < curLen) {
                maxLen = curLen;
                bestStartIdx = i;
            }
        }

        var builder = new StringBuilder();
        for (int i = bestStartIdx; i < bestStartIdx + k; i++) {
            builder.append(strarr[i]);
        }

        return builder.toString();
    }
}
