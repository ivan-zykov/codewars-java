package net.ivanvzykov.codewarsjava;

// https://www.codewars.com/kata/5526fc09a1bbd946250002dc
public class FindParityOutlier {
    static int find(int[] integers) {
        var sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += (integers[i] % 2 == 0) ? 0 : 1;
        }

        var arrayIsMostlyEven = sum <= 1;

        for (int i : integers) {
            if ((arrayIsMostlyEven != (i % 2 == 0))) {
                return i;
            }
        }

        return -1;
    }
}
