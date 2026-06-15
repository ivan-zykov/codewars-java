package net.ivanvzykov.codewarsjava;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//https://www.codewars.com/kata/54a91a4883a7de5d7800009c
public class StringIncrementer {
    public static String incrementString(String str) {
        Matcher matcher = Pattern.compile("\\d+$")
                .matcher(str);

        if (matcher.find()) {
            int startOfSuffix = matcher.start();
            String suffix = str.substring(startOfSuffix);
            var suffixInc = new BigInteger(suffix);
            suffixInc = suffixInc.add(BigInteger.ONE);

            int totalLen = Math.max(
                    suffix.length(),
                    String.valueOf(suffixInc).length()
            );
            var suffixPadded = ("%0" + totalLen + "d").formatted(suffixInc);

            return str.substring(0, startOfSuffix) + suffixPadded;
        }

        return str + '1';
    }
}
