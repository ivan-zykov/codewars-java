package net.ivanvzykov.codewarsjava;

import java.util.HashMap;
import java.util.Map;

// https://www.codewars.com/kata/5270d0d18625160ada0000e4
public class GreedIsGood {
    public static int greedy(int[] dice) {
        Map<Combo, Integer> scores = createScores();

        var freq = new HashMap<Integer, Integer>();
        for (int die : dice) {
            freq.merge(die, 1, Integer::sum);
        }

        int totalScore = 0;

        for (var diceValue : freq.keySet()) {
            var diceCount = freq.get(diceValue);
            while (diceCount > 0) {
                if (diceCount >= 3) {
                    totalScore += scores.get(new Combo(diceValue, 3));
                    diceCount -= 3;
                } else {
                    totalScore += scores.getOrDefault(new Combo(diceValue, 1), 0);
                    diceCount--;
                }
            }
        }

        return totalScore;
    }

    private static Map<Combo, Integer> createScores() {
        var scores = new HashMap<Combo, Integer>();
        scores.put(new Combo(1, 3), 1000);
        scores.put(new Combo(6, 3), 600);
        scores.put(new Combo(5, 3), 500);
        scores.put(new Combo(4, 3), 400);
        scores.put(new Combo(3, 3), 300);
        scores.put(new Combo(2, 3), 200);
        scores.put(new Combo(1, 1), 100);
        scores.put(new Combo(5, 1), 50);

        return scores;
    }

    private record Combo(int diceValue, int count) {
    }
}
