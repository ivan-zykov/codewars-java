package net.ivanvzykov.codewarsjava;

import java.util.Map;
import java.util.Stack;

// https://www.codewars.com/kata/550f22f4d758534c1100025a
public class DirectionsReduction {

    private static final Map<String, String> oppositeDirections = Map.of(
            "NORTH", "SOUTH",
            "SOUTH", "NORTH",
            "EAST", "WEST",
            "WEST", "EAST"
    );

    public static String[] reduce(String[] arr) {
        var path = new Stack<String>();

        for (String next : arr) {
            if (path.isEmpty() || areNotOpposite(path.peek(), next)) {
                path.add(next);
            } else {
                path.pop();
            }
        }

        return path.toArray(new String[0]);
    }

    private static boolean areNotOpposite(String curr, String next) {
        return !oppositeDirections.get(curr).equals(next);
    }
}
