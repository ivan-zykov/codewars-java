package net.ivanvzykov.codewarsjava;

import java.util.stream.Collectors;
import java.util.stream.Stream;

// https://www.codewars.com/kata/513e08acc600c94f01000001
public class RgbToHexConversion {
    public static String rgb(int r, int g, int b) {
        return Stream.of(r, g, b).map(colour -> {
                    if (colour < 0) {
                        return 0;
                    } else if (colour > 255) {
                        return 255;
                    } else {
                        return colour;
                    }
                }).map(colour -> String.format("%02X", colour))
                .collect(Collectors.joining());
    }
}
