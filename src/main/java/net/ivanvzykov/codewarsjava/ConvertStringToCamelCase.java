package net.ivanvzykov.codewarsjava;

public class ConvertStringToCamelCase {

    static String toCamelCase(String s) {
        var idx = 0;

        var result = new StringBuilder();

        while (idx < s.length()) {
            var currChar = s.charAt(idx);
            if ((currChar == '_' || currChar == '-') && idx != s.length() - 1) {
                var nextChar = s.charAt(idx + 1);
                var capitalised = Character.toUpperCase(nextChar);
                result.append(capitalised);
                idx++;
            } else {
                result.append(currChar);
            }
            idx++;
        }

        return result.toString();
    }
}
